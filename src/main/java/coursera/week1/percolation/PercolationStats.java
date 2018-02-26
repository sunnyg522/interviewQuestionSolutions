package coursera.week1.percolation;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {
    private int expCount;
    private Percolation p;
    private double[] f;

    public PercolationStats(int n, int trials){
        if(n<= 0 || trials <= 0)
            throw new IllegalArgumentException("n and trails cannot be less then 0");
        expCount = trials;
        f = new double[expCount];
        for (int exNum = 0; exNum <expCount; exNum++){
            p = new Percolation(n);
            int opSitest =0;
            while (!p.percolates()){
                int x = StdRandom.uniform(1, n+1);
                int y = StdRandom.uniform(1,n+1);
                if(!p.isOpen(x,y)){
                    p.open(x,y);
                    opSitest++;
                }
            }
            double frac = (double) opSitest/(n*n);
            f[exNum] = frac;
        }

    }    // perform trials independent experiments on an n-by-n grid
    public double mean(){
        return StdStats.mean(f);

    }                          // sample mean of percolation threshold
    public double stddev(){
        return StdStats.stddev(f);

    }                    // sample standard deviation of percolation threshold
    public double confidenceLo(){
        return mean() - ((1.96*stddev())) /Math.sqrt(expCount);
    }                  // low  endpoint of 95% confidence interval
    public double confidenceHi(){
        return mean() + ((1.96*stddev())) / Math.sqrt(expCount);
    }                  // high endpoint of 95% confidence interval

    public static void main(String[] args){

    }
}
