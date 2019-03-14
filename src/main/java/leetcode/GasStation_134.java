package leetcode;

/**
 * @project q
 * @authore dgunda on 2019-03-05
 */
public class GasStation_134 {
    public static void main(String[] args) {

    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sumRemaining = 0;
        int total = 0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            int remainingSum = gas[i] - cost[i];
            if (sumRemaining >=0 )
                sumRemaining += remainingSum;
            else {
                sumRemaining = remainingSum;
                start =i;
            }
            total += remainingSum;

        }
        if (total>=0){
            return start;
        }else {
            return -1;
        }
    }
}
