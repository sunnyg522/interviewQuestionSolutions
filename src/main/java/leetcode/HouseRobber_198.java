package leetcode;

import java.util.Arrays;

/**
 * @project q
 * @authore dgunda on 11/7/18
 */
public class HouseRobber_198 {
    public static void main(String[] args) {
        int[] houses = {1,2,3,1};
        System.out.println(rob(houses));
    }
    public static int rob(int[] house){
       int[] dp = new int[house.length];
       if(house==null || house.length==0)
           return 0;
       if(house.length==1)
           return house[0];
       dp[0] = house[0];
       dp[1] = Math.max(house[0],house[1]);
        System.out.println(dp[1]);
       for(int i=2;i<house.length;i++) {
           dp[i] = Math.max(dp[i - 1], dp[i - 2] + house[i]);
       }
       return dp[house.length-1];
    }
}
