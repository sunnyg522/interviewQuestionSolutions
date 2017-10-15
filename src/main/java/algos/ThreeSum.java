package algos;

import java.util.HashMap;
import java.util.Map;

public class ThreeSum {
    public static void main(String[] args) {
        int[] testinput = {3,6,2,7,1,4,6};
        System.out.println(threesum(testinput,12));

    }
    public static boolean threesum(int[] a, int sum){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int t:a){
            if(map.containsKey(t)){
                int c = map.get(t);
                map.put(t,c++);
            }else
                map.put(t,1);
        }

        for(int i =0; i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(map.containsKey(sum-(a[i]+a[j])))
                    return true;
            }
        }
        return false;
    }
}
