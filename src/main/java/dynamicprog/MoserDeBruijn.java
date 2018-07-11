package dynamicprog;

/**
 *
 * The Moser-de Bruijn sequence is the sequence obtained by adding up the distinct powers of the number 4
 * (For example 1, 4, 16, 64, etc).
 * 1) S(2 * n) = 4 * S(n)
 * 2) S(2 * n + 1) = 4 * S(n) + 1
 * with S(0) = 0 and S(1) = 1
 *
 * @project q
 * @authore dgunda on 7/7/18
 */
public class MoserDeBruijn {
    public static void main(String[] args) {
        System.out.println(mdb(5));
    }
    public static int mdb(int n){
        if(n==0)
            return 0;
        else if (n==1)
            return 1;
        else if(n%2==0)
            return 4*mdb(n/2);
        else if(n%2==1)
            return 4*mdb(n/2)+1;
        return 0;
    }
}
