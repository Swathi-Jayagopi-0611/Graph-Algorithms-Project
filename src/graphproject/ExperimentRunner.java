package graphproject;

import java.util.*;

public class ExperimentRunner {

    public static void main(String[] args) {

        int[] sizes = {100, 500, 1000, 5000};

        for (int size : sizes) {

            Graph g = new Graph();
            List<Vertex> vertices = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Vertex v = new Vertex(i);
                g.addVertex(v);
                vertices.add(v);
            }

            Random rand = new Random();

            for (int i = 0; i < size * 3; i++) {
                Vertex v1 = vertices.get(rand.nextInt(size));
                Vertex v2 = vertices.get(rand.nextInt(size));
                g.addEdge(v1, v2, rand.nextInt(10));
            }

            long start = System.nanoTime();
            GraphAlgorithms.BFS(g, vertices.get(0));
            long bfsTime = System.nanoTime() - start;

            start = System.nanoTime();
            GraphAlgorithms.DFS(g, vertices.get(0), new HashSet<>());
            long dfsTime = System.nanoTime() - start;

            System.out.println("\nSize: " + size +
                    " BFS: " + bfsTime +
                    " DFS: " + dfsTime);
        }
    }
}