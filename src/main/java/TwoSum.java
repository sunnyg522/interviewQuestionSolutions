import java.util.HashMap;

/**
 * Created by dgunda on 9/19/17.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] testInput = {4,6,7,9,10,20,5,20};
        System.out.println(getTwoSum(null,100));
    }
    public static boolean getTwoSum(int[] input, int testSum){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        if(input == null)
            throw new IllegalArgumentException("Array is null");
        for (int i: input){
            if(!map.containsKey(i))
                map.put(i,1);
            else {
                int temp = map.get(i);
                map.put(i, temp++);
            }
        }
        for (int i: input){
                return map.containsKey(testSum-i);
        }
        return false;
    }
}
