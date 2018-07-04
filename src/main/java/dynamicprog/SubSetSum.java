package dynamicprog;

/**
 * Given a set of non-negative integers, and a value sum, determine if there
 * is a subset of the given set with sum equal to given sum.
 *
 * Examples: set[] = {3, 34, 4, 12, 5, 2}, sum = 9
 * Output:  True  //There is a subset (4, 5) with sum 9.
 * @project q
 * @authore dgunda on 7/3/18
 */
public class SubSetSum {
    public static void main(String[] args) {
        int arr[] = {3, 34, 4, 12, 5, 2};
        int lenOfArr = arr.length;
        System.out.println(isSubSum(arr,lenOfArr,17));
    }

    // if the given number is part of solution or not part of solution.
    public static boolean isSubSum(int[] s, int lenthOfArr, int sum){
        if(sum == 0)
            return true;
        if(lenthOfArr == 0 && sum !=0)
            return false;
        return isSubSum(s, lenthOfArr-1, sum-s[lenthOfArr-1]) || isSubSum(s, lenthOfArr-1,sum);

    }
}
