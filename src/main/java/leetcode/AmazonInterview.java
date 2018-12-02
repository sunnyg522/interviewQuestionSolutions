package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @project q
 * @authore dgunda on 11/22/18
 */
public class AmazonInterview {
    public static void main(String[] args) {
        //BackGround app ;
        List<List<Integer>> bapps = new ArrayList<>();
        List<Integer> b1 = new ArrayList<>(Arrays.asList(1,3));
        List<Integer> b2 = new ArrayList<>(Arrays.asList(2,5));
        List<Integer> b3 = new ArrayList<>(Arrays.asList(3,7));
        List<Integer> b4 = new ArrayList<>(Arrays.asList(4,10));
        bapps.add(b1);
        bapps.add(b2);
        bapps.add(b3);
        bapps.add(b4);

        List<List<Integer>> fapps = new ArrayList<>();
        List<Integer> f1 = new ArrayList<>(Arrays.asList(1,2));
        List<Integer> f2 = new ArrayList<>(Arrays.asList(2,3));
        List<Integer> f3 = new ArrayList<>(Arrays.asList(3,4));
        List<Integer> f4 = new ArrayList<>(Arrays.asList(4,5));
        fapps.add(f1);
        fapps.add(f2);
        fapps.add(f3);
        fapps.add(f4);
        System.out.println(optimalUtilization(10,bapps,fapps));
    }
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static List<List<Integer>> optimalUtilization(
            int deviceCapacity,
            List<List<Integer>> foregroundAppList,
            List<List<Integer>> backgroundAppList)
    {
        List<List<Integer>> listOfId = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<foregroundAppList.size();i++){
            for(int j=0;j<backgroundAppList.size();j++){
                int sumOfApps = (foregroundAppList.get(i).get(1)+backgroundAppList.get(j).get(1));
                int tempDiff = deviceCapacity - sumOfApps;
                System.out.println(tempDiff);
                if(tempDiff < minDiff && sumOfApps <= deviceCapacity && tempDiff>=0){
                    // clear the list and add.
                    // add to list
                    listOfId.clear();
                    minDiff = tempDiff;
                    List<Integer> appId = new ArrayList<>();
                    //adding foregroundApp
                    appId.add(foregroundAppList.get(i).get(0));
                    //adding BackGroundApp
                    appId.add(backgroundAppList.get(j).get(0));
                    listOfId.add(appId);

                } else if(tempDiff == minDiff){
                    // add to list
                    List<Integer> appId = new ArrayList<>();
                    //adding foregroundApp
                    appId.add(foregroundAppList.get(i).get(0));
                    //adding BackGroundApp
                    appId.add(backgroundAppList.get(j).get(0));
                    listOfId.add(appId);
                }
            }
        }

        return listOfId;
    }
}
