package src;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MST {
    private final AdjacencyListGraph graph;

    public MST(AdjacencyListGraph _graph) {
        this.graph = _graph;
    }

    public void printMST() {
        ArrayList<Edge> MSTEdges = this.primMST(this.graph);
        int distance = 0;

        for (Edge edge : MSTEdges) {
            System.out.printf("src.Edge: <from: %s> <to: %s> <weight: %s>%n", edge.from.name, edge.to.name, edge.weight);
            distance += edge.weight;
        }

        int totalPrice = distance * 1000000;
        System.out.printf("Total price: %s%n", totalPrice);
    }

    private ArrayList<Edge> primMST(AdjacencyListGraph graph) {
        ArrayList<Edge> edges = new ArrayList<>();
        ArrayList<Vertex> visited = new ArrayList<>();

        // init priority queue
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();

        // add all edges from index vertex
        visited.add(graph.vertices.get(0));
        priorityQueue.addAll(graph.vertices.get(0).outEdges);

        while (!priorityQueue.isEmpty()) {
            Edge chosenEdge = priorityQueue.poll();

            // If already visited, continue
            if (visited.contains(chosenEdge.to)) {
                continue;
            }

            // Add edge to graph
            edges.add(chosenEdge);
            visited.add(chosenEdge.to);

            // Add vertices to PQ
            priorityQueue.addAll(chosenEdge.to.outEdges);
        }

        return edges;
    }
}