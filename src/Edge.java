package src;

public class Edge implements Comparable<Edge> {
    public Vertex from;
    public Vertex to;
    public Integer weight;

    public Edge(Vertex from, Vertex to, Integer weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;

        this.from.addOutEdge(this);
    }

    @Override
    public int compareTo(Edge other) {
        return weight - other.weight;
    }
}