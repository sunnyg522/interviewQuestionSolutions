package coursera.week1.percolation;

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private boolean[][] opened;
    private int top = 0;
    private int bottom ;
    private int sizeOfGrid;
    private int n;
    private WeightedQuickUnionUF weightedQuickUnionUF;

    public Percolation(int N){
        sizeOfGrid = N;
        bottom = sizeOfGrid *sizeOfGrid+1;
        weightedQuickUnionUF = new WeightedQuickUnionUF(sizeOfGrid * sizeOfGrid + 2);
        opened = new boolean[sizeOfGrid][sizeOfGrid];
        n = 0;
    }
    public    void open(int row, int col) {
        opened[row-1][col-1] = true;
        n++;
        if(row == 1)
            weightedQuickUnionUF.union(getIndex(row, col), top);
        if(row == sizeOfGrid)
            weightedQuickUnionUF.union(getIndex(row, col), bottom);
        if(col >1 && isOpen(row, col-1))
            weightedQuickUnionUF.union(getIndex(row, col), getIndex(row, col-1));
        if(col < sizeOfGrid && isOpen(row, col+1))
            weightedQuickUnionUF.union(getIndex(row, col), getIndex(row, col+1));
        if(row > 1 && isOpen(row-1, col))
            weightedQuickUnionUF.union(getIndex(row-1, col), getIndex(row, col));
        if(row < sizeOfGrid && isOpen(row+1, col))
            weightedQuickUnionUF.union(getIndex(row+1, col), getIndex(row, col));
    }
    public boolean isOpen(int row, int col) {
        return opened[row - 1][col -1];
    }
    public boolean isFull(int row, int col){
        if(0<row && row <= sizeOfGrid && 0<col && col <=sizeOfGrid)
            return weightedQuickUnionUF.connected(top, getIndex(row, col));
        else
            throw new IndexOutOfBoundsException("index out of bound");
    }
    public     int numberOfOpenSites()     {
        return n;
    }
    public boolean percolates(){
        return weightedQuickUnionUF.connected(top, bottom);
    }
    public int getIndex(int row, int col){
        return sizeOfGrid*(row - 1)+col;
    }

    public static void main(String[] args){

    }
}