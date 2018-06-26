package coursera.week1_II;

import org.testng.annotations.Test;

/**
 * @project q
 * @authore dgunda on 5/23/18
 */
public class GraphTest {
    @Test
    public void testGrapPopulation(){
        Graph G = new Graph(13);
        /**
         * 0 5
         4 3
         0 1
         9 12
         6 4
         5 4
         0 2
         11 12
         9 10
         0 6
         7 8
         9 11
         5 3
         */

        G.addEdge(0,5);
        //G.addEdge(0,0);
        G.addEdge(4,3);
        G.addEdge(0,1);
        G.addEdge(9,12);
        G.addEdge(6,4);
        G.addEdge(5,4);
        G.addEdge(0,2);
        G.addEdge(11,12);
        G.addEdge(9,10);
        G.addEdge(0,6);
        G.addEdge(7,8);
        G.addEdge(9,11);
        G.addEdge(5,3);

        /*for (int v=0; v<G.V(); v++){
            for(int w:G.adj(v)){
                System.out.println(v+"-"+w);
            }
        }*/
        System.out.println(G.toString());
        System.out.println("Degree of vertex 12: "+G.dgree(12));
        System.out.println("Max Degree: "+G.maxDegree());
        System.out.println("number of self loops: "+G.numberOfSelfLoops());

    }

}
