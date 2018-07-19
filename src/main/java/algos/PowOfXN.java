package algos;

/**
 * @project q
 * @authore dgunda on 7/18/18
 */
public class PowOfXN {
    public static void main(String[] args) {
        System.out.println(pwd(2,4));
    }
    public static int pwd(int x, int y){
        if(y==0)
            return 1;
        else if(y%2==0){
            return pwd(x, y/2) * pwd(x,y/2);
        }
        else
            return x*pwd(x,y/2) * pwd(x,y/2);
    }
}
