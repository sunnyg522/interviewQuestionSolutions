package leetcode;

/**
 * @project q
 * @authore dgunda on 11/21/18
 */
public class ContainerWithMostWater_11 {
    public static void main(String[] args) {
        int[] input = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(input));
    }
    public static int maxArea(int[] height){
        int maxArea = Integer.MIN_VALUE;
        int l =0, r = height.length - 1;
        while (l<r){
            maxArea = Math.max(maxArea, Math.min(height[l], height[r])*(r-l));
            if(height[r]<height[l])
                r--;
            else
                l++;
        }
        return maxArea;
    }
}
