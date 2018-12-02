package leetcode;


import java.util.*;

/**
 * @project q
 * @authore dgunda on 11/22/18
 */
public class AmazonInterview2 {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> d1 = new ArrayList<>(Arrays.asList(1,2));
        List<Integer> d2 = new ArrayList<>(Arrays.asList(3,4));
        List<Integer> d3 = new ArrayList<>(Arrays.asList(1,-1));
        List<Integer> d4 = new ArrayList<>(Arrays.asList(1,-1));
        lists.add(d1);
        lists.add(d2);
        lists.add(d3);
        lists.add(d4);
        System.out.println(nearestXsteakHouses(3,lists,2));

    }
    public static List<List<Integer>> nearestXsteakHouses(int totalSteakhouses,
                                                          List<List<Integer>> allLocations,
                                                          int numSteakhouses)
    {
        if(allLocations.size() == 0 || numSteakhouses == 0){
            return new ArrayList<List<Integer>>();
        }

        Map<List<Integer>, Integer> map = new HashMap<List<Integer>, Integer>();
        for(int i=0;i<allLocations.size();i++){
            List<Integer> list = allLocations.get(i);
            long dist = Math.round(Math.sqrt(Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2)));

            map.put(list, Math.toIntExact(dist));
        }

        List<Map.Entry<List<Integer>, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        List<List<Integer>> listOfResult = new ArrayList<List<Integer>>();

        int PrevDistance = 0;
        for (Map.Entry<List<Integer>, Integer> entry : list) {
            //result.put(entry.getKey(), entry.getValue());
            if (entry.getValue() != PrevDistance){
                listOfResult.add(entry.getKey());
                --numSteakhouses;
            }
            PrevDistance = entry.getValue();
            if(numSteakhouses == 0){
                break;
            }
        }

        return listOfResult;

    }
    // METHOD SIGNATURE ENDS

}
