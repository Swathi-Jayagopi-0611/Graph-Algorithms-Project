package graphproject;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== GRAPH DEMO =====");

        Graph g = new Graph();

        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);

        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);

        g.addEdge(v1, v2, 5);
        g.addEdge(v1, v3, 10);
        g.addEdge(v2, v4, 3);
        g.addEdge(v3, v4, 1);

        g.printGraph();

        System.out.println("\nBFS:");
        GraphAlgorithms.BFS(g, v1);

        System.out.println("\nDFS:");
        GraphAlgorithms.DFS(g, v1, new HashSet<>());

        System.out.println("\nDijkstra:");
        Map<Vertex, Integer> result =
                GraphAlgorithms.dijkstra(g, v1);

        for (Vertex v : result.keySet()) {
            System.out.println(v + " -> " + result.get(v));
        }
    }
}