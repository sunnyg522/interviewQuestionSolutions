package dynamicprog;

/**
 * @project q
 * @authore dgunda on 7/5/18
 */
public class PerfectSumProblem {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6, 8, 10};
    }
    public static void printPerfectSum(int s[], int m, int sum){
        //Todo:  need to revisit this problem
        int aux[] = new int[m+1];
        for(int i=1;i<=m;i++){
            for(int j=s[i];j<sum; j++){
                aux[j] = aux[sum-j-1];
            }
        }
    }
}
