package leetcode;

import java.util.HashMap;

/**
 * @project q
 * @authore dgunda on 2/3/19
 */
public class TwoSum_III {
    private  static HashMap<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        add(1);
        add(3);
        add(5);
        System.out.println(fin(4));
        System.out.println(fin(7));
    }
    public static void add(int number){
        if(map.containsKey(number)){
            map.put(number,map.get(number) +1);
        }else
            map.put(number,1);
    }
    public static boolean fin(int value){
        for(Integer i: map.keySet()){
            int target = value - i;
            if (map.containsKey(target)) {
                if (i == target && map.get(target) < 2) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }

}
