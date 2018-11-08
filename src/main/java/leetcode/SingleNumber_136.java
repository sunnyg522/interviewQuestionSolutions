package leetcode;

/**
 * @project q
 * @authore dgunda on 11/6/18
 */
public class SingleNumber_136 {
    public static void main(String[] args) {
        int[] input = {2,2,1,3,3,4,5,4,5,1,11};
        System.out.println(getSingleNumber(input));
    }
    public static int getSingleNumber(int[] input){
        int singNumber = input[0];
        for(int i=1;i<input.length;i++){
            singNumber = singNumber^input[i];
        }
        return singNumber;
    }
}
