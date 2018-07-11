package dynamicprog;

/**
 * @project q
 * @authore dgunda on 7/4/18
 */
public class SubSetSumDivByM {
    public static void main(String[] args) {
        int arr[] = {1, 6};
        int div = 6;
        int arrayLength = arr.length;
        int sum = 1;
        System.out.println(susSetSumDiv(arr,arrayLength,sum,div));
    }
    public static boolean susSetSumDiv(int s[], int arrLength, int sum, int div){
        if (sum % div == 0 && sum !=0) {
            System.out.println(sum);
            return true;
        }
        if(arrLength==0 && (sum%div) != 0)
            return false;
        return susSetSumDiv(s, arrLength-1, sum+s[arrLength-1],div ) || susSetSumDiv(s, arrLength-1, sum, div);
    }
}
