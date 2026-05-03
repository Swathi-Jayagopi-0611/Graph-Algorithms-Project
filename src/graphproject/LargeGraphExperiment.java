package graphproject;

import java.util.*;

public class LargeGraphExperiment {

    public static void main(String[] args) {

        int[] sizes = {10000, 20000, 50000};

        for (int size : sizes) {

            Graph g = new Graph();
            List<Vertex> vertices = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Vertex v = new Vertex(i);
                g.addVertex(v);
                vertices.add(v);
            }

            Random rand = new Random();

            for (int i = 0; i < size * 2; i++) {
                g.addEdge(vertices.get(rand.nextInt(size)),
                        vertices.get(rand.nextInt(size)),
                        rand.nextInt(10));
            }

            long start = System.currentTimeMillis();

            GraphAlgorithms.BFS(g, vertices.get(0));

            long time = System.currentTimeMillis() - start;

            System.out.println("Size: " + size + " Time: " + time + " ms");
        }
    }
}