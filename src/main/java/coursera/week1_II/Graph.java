package coursera.week1_II;

import coursera.week2.Bag;

import java.util.Iterator;

/**
 * @project q
 * @authore dgunda on 5/23/18
 */
public class Graph {
    private static final String NEWLINE = System.getProperty("line.separator");
    private final int V;
    private int E;
    private Bag<Integer>[] adj;

    public Graph(int V) {
        this.V = V;
        adj =  (Bag<Integer>[]) new Bag[V];
        for(int v=0; v<V; v++){
            adj[v] = new Bag<Integer>();
        }
    }

    public int V(){
        return V;
    }
    public int E(){
        return E;
    }
    public void addEdge(int v, int w){
        E++;
        adj[v].add(w);
        adj[w].add(v);
    }

    public Iterable<Integer> adj(int v){
        return adj[v];
    }

    public int dgree(int v){
        return adj[v].size();
    }

    public int maxDegree(){
        int max = 0;
        for(int v=0; v<V ; v++){
            max = Math.max(adj[v].size(), max);
        }
        return max;
    }

    /**
     * If the node points to itself, then it is called self loop.
     * @return
     */
    public int numberOfSelfLoops(){
        int count = 0;
        for(int v=0; v<V; v++){
            for(int w:adj[v]){
                if(v==w)
                    count++;
            }
        }
        return count/2;
    }

    /**
     * To String method to print adj vertices
     * @return
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(V + " vertices, " + E + " edges " + NEWLINE);
        for (int v = 0; v < V; v++) {
            s.append(v + ": ");
            for (int w : adj[v]) {
                s.append(w + " ");
            }
            s.append(NEWLINE);
        }
        return s.toString();
    }

    /*public static int degree(Graph G, int V){
        int degree = 0;
        for(int i=0; i< G.V(); i++){
            degree++;
        }
        return degree;
    }*/
}
