package algos;


/**
 * Created by dgunda on 9/19/17.
 */
public class MaxOdd {
    public static void main(String[] args) {
        int[] testInput = {0,2,4,30,36,6,8,68,7};
        int[] teststEven = {2,4,4,6};
        int[] testNull = {};
        System.out.println("max odd number is: "+getMaxOdd(testInput));
        System.out.println("max odd number is: "+getMaxOdd(teststEven));
        System.out.println("max odd number is: "+getMaxOdd(testNull));

    }
    public static int getMaxOdd(int[] input){
        int maxNumber = Integer.MIN_VALUE;
        if(input == null)
            throw new NullPointerException("input value cannot be null");
        for(int i: input){
            if(isOdd(i))
                maxNumber = Math.max(maxNumber,i);
        }
        if(maxNumber == Integer.MIN_VALUE)
            throw new NoSuchFieldError("no odd Number Found");
        return maxNumber;
    }
    public static boolean isOdd(int i){
        return i%2 ==1?true : false;
    }
}
