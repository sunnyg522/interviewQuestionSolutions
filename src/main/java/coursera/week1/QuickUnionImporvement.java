package coursera.week1;

public class QuickUnionImporvement {
    private int[] id;
    private int[] size;


    public void QuickUnionImporvement(int i){
        id = new int[i];
        size = new int[i];
        for(int j = 0;j<id.length; j++){
            id[j] = j;
            size[j] = 0;
        }
    }

    public void union(int p, int q){
        int pid = root(p);
        int qid = root(q);
        if(pid == qid)
            return;

        // will get the size and add it to the root of smaller tree.
        if(size[p] > size[q]){
            size[q] += size[p];
            id[q] = pid;
        }else{
            size[p] += size[q];
            id[p] = qid;
        }
    }

    public boolean isConnected(int p, int q){
        return root(p) == root(q);
    }

    public int root(int i){
        while(i != id[i] )
            i = id[i];
        return i;
    }
}
