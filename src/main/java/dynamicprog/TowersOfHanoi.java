package dynamicprog;

/**
 * @project q
 * @authore dgunda on 7/2/18
 */
public class TowersOfHanoi {
    public static void main(String[] args) {
        moves(3,true);
    }
    public static void moves(int n, boolean left){
        if(n==0)
            return ;
        // move n-1 discs to another rod
        moves(n-1, !left);
        if (left) System.out.println(n+ " left");
        else System.out.println(n+ " right");
        // move last disc and remaining n-1 discs to other rod.
        moves(n-1, !left);
    }
}
