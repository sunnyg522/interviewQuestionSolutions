package coursera.week1;

import org.testng.annotations.Test;

public class QuickFindUFTest {
    public QuickFindUF quickFindUF ;

    @Test
    public void union(){
        quickFindUF = new QuickFindUF(10);
        quickFindUF.union(3,4);
        quickFindUF.union(3,8);
        quickFindUF.union(4,9);
        quickFindUF.union(1,2);
        quickFindUF.union(6,7);
        quickFindUF.union(1,6);
        quickFindUF.union(5,6);
        quickFindUF.union(0,5);
        System.out.println(quickFindUF.isConnected(3,4)+"");
        System.out.println(quickFindUF.isConnected(1,6)+"");
    }

    @Test
    public void isConnectedTest(){

    }
}
