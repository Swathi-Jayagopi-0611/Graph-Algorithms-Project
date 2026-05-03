package graphproject;

import java.util.*;

public class Graph {

    private Map<Vertex, List<Edge>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(Vertex v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }

    public void addEdge(Vertex src, Vertex dest, int weight) {
        adjList.get(src).add(new Edge(dest, weight));
    }

    public Map<Vertex, List<Edge>> getAdjList() {
        return adjList;
    }

    public void printGraph() {
        for (Vertex v : adjList.keySet()) {
            System.out.print(v + " -> ");
            for (Edge e : adjList.get(v)) {
                System.out.print(e.destination + "(" + e.weight + ") ");
            }
            System.out.println();
        }
    }
}