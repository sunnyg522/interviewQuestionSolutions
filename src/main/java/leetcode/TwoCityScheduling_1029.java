package leetcode;

/**
 * @project q
 * @authore dgunda on 2019-06-11
 */
public class TwoCityScheduling_1029 {
    public static void main(String[] args) {

    }
    public static int twoCitySchedCost(int[][] costs) {
        int total = 0;
        int countA = costs.length/2;
        int countB = costs.length/2;
        for(int[] cost: costs){
            if(cost[0]<=cost[1] && countA!=0){
                total = total+cost[0];
                countA--;
            }else{
                total = total+cost[1];
            }
        }
        return total;
    }
}
