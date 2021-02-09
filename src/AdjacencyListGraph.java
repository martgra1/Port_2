package src;

import java.util.ArrayList;

public class AdjacencyListGraph {
    public ArrayList<Vertex> vertices;

    public AdjacencyListGraph() {
        this.vertices = new ArrayList<>();
    }

    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    public void addEdge(Vertex from, Vertex to, Integer weight) {
        if (!vertices.contains(from) && !vertices.contains(to)) {
            System.out.println(" src.Vertex not found ");
        } else {
            new Edge(from, to, weight);
        }
    }

    public void printGraph() {
        Vertex curVertex;

        for (Vertex vertex : this.vertices) {
            curVertex = vertex;

            System.out.println(" Edges from src. Vertex: " + curVertex.name);

            for (int j = 0; j < curVertex.outEdges.size(); j++) {
                Edge curEdge = curVertex.outEdges.get(j);
                System.out.println("To " + curEdge.to.name + " weight " + curEdge.weight);
            }

            System.out.println(" ");
        }
    }
}