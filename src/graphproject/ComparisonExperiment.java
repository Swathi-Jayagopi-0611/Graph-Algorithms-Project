package graphproject;

import java.util.*;

public class ComparisonExperiment {

    public static void main(String[] args) {

        Graph g = new Graph();
        List<Vertex> vertices = new ArrayList<>();

        int size = 1000;

        for (int i = 0; i < size; i++) {
            Vertex v = new Vertex(i);
            g.addVertex(v);
            vertices.add(v);
        }

        Random rand = new Random();

        for (int i = 0; i < size * 3; i++) {
            g.addEdge(vertices.get(rand.nextInt(size)),
                    vertices.get(rand.nextInt(size)),
                    rand.nextInt(10));
        }

        long start = System.nanoTime();
        GraphAlgorithms.BFS(g, vertices.get(0));
        long bfs = System.nanoTime() - start;

        start = System.nanoTime();
        GraphAlgorithms.dijkstra(g, vertices.get(0));
        long dijkstra = System.nanoTime() - start;

        System.out.println("\nBFS Time: " + bfs);
        System.out.println("Dijkstra Time: " + dijkstra);
    }
}