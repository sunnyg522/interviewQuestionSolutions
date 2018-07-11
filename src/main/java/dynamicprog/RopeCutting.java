package dynamicprog;

/**
 * @project q
 * @authore dgunda on 7/5/18
 */
public class RopeCutting {
    public static void main(String[] args) {
        int arr[] = {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println(cutRopeDP(arr,arr.length));

    }
    public static int cutRope(int price[], int m){
        if(m<=0)
            return 0;
        int maxValue = Integer.MIN_VALUE;
        for (int i=0;i<m;i++){
            maxValue = Math.max(maxValue,price[i]+cutRope(price,m-i-1));
        }
        return maxValue;
    }

    public static int cutRopeDP(int price[], int m){
        int mem[] = new int[m+1];
        for(int i=1;i<=m;i++){
            int maxValue = Integer.MIN_VALUE;
            for (int j=0;j<i;j++){
                maxValue = Math.max(maxValue,price[j]+mem[i-j-1]);
                mem[i] = maxValue;
            }
        }
        return mem[m];
    }
}
