package src;

import java.util.ArrayList;

public class Vertex implements Comparable<Vertex> {
    public String name;
    public ArrayList<Edge> outEdges;
    public Integer distance = Integer.MAX_VALUE;

    public Vertex(String _id) {
        this.name = _id;
        this.outEdges = new ArrayList<>();
    }

    public void addOutEdge(Edge outEdge) {
        outEdges.add(outEdge);
    }

    @Override
    public int compareTo(Vertex o) {
        if (this.distance < o.distance) {
            return -1;
        } else if (this.distance > o.distance) {
            return 1;
        }

        return 0;
    }
}