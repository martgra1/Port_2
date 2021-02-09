package src;

public class Run {

    private static AdjacencyListGraph PrimMST() {
        AdjacencyListGraph adjgraph = new AdjacencyListGraph();
        Vertex A = new Vertex("Eskildstrup");
        adjgraph.addVertex(A);
        Vertex B = new Vertex("Haslev");
        adjgraph.addVertex(B);
        Vertex C = new Vertex("Holbæk");
        adjgraph.addVertex(C);
        Vertex D = new Vertex("Jærgerspris");
        adjgraph.addVertex(D);
        Vertex E = new Vertex("Kalundborg");
        adjgraph.addVertex(E);
        Vertex F = new Vertex("Korsør");
        adjgraph.addVertex(F);
        Vertex G = new Vertex("Køge");
        adjgraph.addVertex(G);
        Vertex H = new Vertex("Maribo");
        adjgraph.addVertex(H);
        Vertex I = new Vertex("Næstved");
        adjgraph.addVertex(I);
        Vertex J = new Vertex("Ringsted");
        adjgraph.addVertex(J);
        Vertex K = new Vertex("Slagelse");
        adjgraph.addVertex(K);
        Vertex L = new Vertex("Nykøbing F");
        adjgraph.addVertex(L);
        Vertex M = new Vertex("Vordingborg");
        adjgraph.addVertex(M);
        Vertex N = new Vertex("Roskilde");
        adjgraph.addVertex(N);
        Vertex O = new Vertex("Sorø");
        adjgraph.addVertex(O);
        Vertex P = new Vertex("Nakskov");
        adjgraph.addVertex(P);

        adjgraph.addEdge(A, H, 28);
        adjgraph.addEdge(A, L, 13);
        adjgraph.addEdge(A, M, 24);

        adjgraph.addEdge(B, F, 60);
        adjgraph.addEdge(B, G, 24);
        adjgraph.addEdge(B, I, 25);
        adjgraph.addEdge(B, J, 19);
        adjgraph.addEdge(B, N, 47);
        adjgraph.addEdge(B, K, 48);
        adjgraph.addEdge(B, O, 34);
        adjgraph.addEdge(B, M, 40);

        adjgraph.addEdge(C, D, 34);
        adjgraph.addEdge(C, E, 44);
        adjgraph.addEdge(C, F, 66);
        adjgraph.addEdge(C, J, 36);
        adjgraph.addEdge(C, N, 32);
        adjgraph.addEdge(C, K, 46);
        adjgraph.addEdge(C, O, 34);

        adjgraph.addEdge(D, F, 95);
        adjgraph.addEdge(D, G, 58);
        adjgraph.addEdge(D, J, 56);
        adjgraph.addEdge(D, N, 33);
        adjgraph.addEdge(D, K, 74);
        adjgraph.addEdge(D, O, 63);
        adjgraph.addEdge(D, C, 34);

        adjgraph.addEdge(E, J, 62);
        adjgraph.addEdge(E, N, 70);
        adjgraph.addEdge(E, K, 39);
        adjgraph.addEdge(E, O, 51);
        adjgraph.addEdge(E, C, 44);

        adjgraph.addEdge(F, I, 45);
        adjgraph.addEdge(F, K, 20);
        adjgraph.addEdge(F, B, 60);
        adjgraph.addEdge(F, C, 66);
        adjgraph.addEdge(F, D, 95);

        adjgraph.addEdge(G, I, 45);
        adjgraph.addEdge(G, J, 28);
        adjgraph.addEdge(G, N, 25);
        adjgraph.addEdge(G, M, 60);
        adjgraph.addEdge(G, B, 24);
        adjgraph.addEdge(G, D, 58);

        adjgraph.addEdge(H, P, 27);
        adjgraph.addEdge(H, L, 26);
        adjgraph.addEdge(H, A, 28);


        adjgraph.addEdge(I, N, 57);
        adjgraph.addEdge(I, J, 26);
        adjgraph.addEdge(I, K, 37);
        adjgraph.addEdge(I, O, 32);
        adjgraph.addEdge(I, M, 28);
        adjgraph.addEdge(I, B, 25);
        adjgraph.addEdge(I, F, 45);
        adjgraph.addEdge(I, G, 45);

        adjgraph.addEdge(J, N, 31);
        adjgraph.addEdge(J, O, 15);
        adjgraph.addEdge(J, M, 58);
        adjgraph.addEdge(J, B, 19);
        adjgraph.addEdge(J, C, 36);
        adjgraph.addEdge(J, D, 56);
        adjgraph.addEdge(J, E, 62);
        adjgraph.addEdge(J, G, 28);
        adjgraph.addEdge(J, I, 26);

        adjgraph.addEdge(K, O, 14);
        adjgraph.addEdge(K, B, 48);
        adjgraph.addEdge(K, C, 46);
        adjgraph.addEdge(K, D, 74);
        adjgraph.addEdge(K, E, 39);
        adjgraph.addEdge(K, F, 20);
        adjgraph.addEdge(K, I, 37);

        adjgraph.addEdge(L, A, 13);
        adjgraph.addEdge(L, H, 26);

        adjgraph.addEdge(M, A, 24);
        adjgraph.addEdge(M, B, 40);
        adjgraph.addEdge(M, G, 60);
        adjgraph.addEdge(M, I, 28);
        adjgraph.addEdge(M, J, 58);

        adjgraph.addEdge(N, B, 47);
        adjgraph.addEdge(N, C, 32);
        adjgraph.addEdge(N, D, 33);
        adjgraph.addEdge(N, E, 70);
        adjgraph.addEdge(N, G, 25);
        adjgraph.addEdge(N, I, 57);
        adjgraph.addEdge(N, J, 31);

        adjgraph.addEdge(O, B, 34);
        adjgraph.addEdge(O, C, 34);
        adjgraph.addEdge(O, D, 63);
        adjgraph.addEdge(O, E, 51);
        adjgraph.addEdge(O, I, 32);
        adjgraph.addEdge(O, J, 15);
        adjgraph.addEdge(O, K, 13);

        adjgraph.addEdge(P, H, 27);

        adjgraph.printGraph();
        return adjgraph;
    }

    public static void main(String args[]) {
        // use prim's algorithm to calculate min spanning tree and costs
        MST minSpanningTree = new MST(PrimMST());
        minSpanningTree.printMST();
    }
}
