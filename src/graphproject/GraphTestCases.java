package graphproject;

public class GraphTestCases {

    public static void main(String[] args) {

        Graph g = new Graph();

        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);

        g.addVertex(v1);
        g.addVertex(v2);

        g.addEdge(v1, v2, 5);

        System.out.println("TEST CASE: Edge Creation");
        g.printGraph();

        System.out.println("TEST PASSED if edge displayed correctly");
    }
}