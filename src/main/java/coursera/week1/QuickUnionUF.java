package coursera.week1;

public class QuickUnionUF {

    private int[] id;

    public void QuickUnionUF(int n){
        id = new int[n];
        for(int i = 0; i< n; i++){
            id[i]= i;
        }
    }

    public int root(int i){
        while(i != id[i] )
            i = id[i];
        return i;
    }

    public boolean isConnected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int pid = root(p);
        int qid = root(q);
        id[pid] = qid;
    }
}
