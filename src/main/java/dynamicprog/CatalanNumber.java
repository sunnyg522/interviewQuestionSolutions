package dynamicprog;

/**
 * @project q
 * @authore dgunda on 7/2/18
 */
public class CatalanNumber {
    public static void main(String[] args) {
        System.out.println(catNumber(5));
        System.out.println(dpCatNumber(9));
    }
    public static int catNumber(int n){
        int res = 0;
        if(n==0 || n==1)
            return 1;
        for (int i=0;i<n;i++){
            res += catNumber(i)*catNumber(n-i-1);
        }
        return res;
    }

    public static int dpCatNumber(int n){
        int[] mem = new int[n+1];
        mem[0]=1;
        mem[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                mem[i] += mem[j]*mem[i-j-1];
            }
        }
        return mem[n];
    }
}
