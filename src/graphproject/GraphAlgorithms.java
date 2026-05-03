package graphproject;

import java.util.*;

public class GraphAlgorithms {

    // BFS
    public static void BFS(Graph g, Vertex start) {

        Set<Vertex> visited = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            Vertex v = queue.poll();
            System.out.print(v + " ");

            for (Edge e : g.getAdjList().get(v)) {
                if (!visited.contains(e.destination)) {
                    visited.add(e.destination);
                    queue.add(e.destination);
                }
            }
        }
    }

    // DFS
    public static void DFS(Graph g, Vertex start, Set<Vertex> visited) {

        visited.add(start);
        System.out.print(start + " ");

        for (Edge e : g.getAdjList().get(start)) {
            if (!visited.contains(e.destination)) {
                DFS(g, e.destination, visited);
            }
        }
    }

    // Dijkstra
    public static Map<Vertex, Integer> dijkstra(Graph g, Vertex start) {

        Map<Vertex, Integer> dist = new HashMap<>();

        for (Vertex v : g.getAdjList().keySet()) {
            dist.put(v, Integer.MAX_VALUE);
        }

        dist.put(start, 0);

        PriorityQueue<Vertex> pq =
                new PriorityQueue<>(Comparator.comparingInt(dist::get));

        pq.add(start);

        while (!pq.isEmpty()) {

            Vertex current = pq.poll();

            for (Edge e : g.getAdjList().get(current)) {

                int newDist = dist.get(current) + e.weight;

                if (newDist < dist.get(e.destination)) {
                    dist.put(e.destination, newDist);
                    pq.add(e.destination);
                }
            }
        }

        return dist;
    }
}