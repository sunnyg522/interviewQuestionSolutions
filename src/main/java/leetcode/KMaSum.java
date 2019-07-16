package leetcode;


import java.util.*;

/**
 * @project q
 * @authore dgunda on 2019-06-23
 */
public class KMaSum {
    static class Pair implements Comparable<Pair>{
        List<Integer> cordenate;
        int distance;

        public Pair(List<Integer> cordenate, int distance) {
            this.cordenate = cordenate;
            this.distance = distance;
        }


        public List<Integer> getCordenate() {
            return cordenate;
        }

        public void setCordenate(List<Integer> cordenate) {
            this.cordenate = cordenate;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        @Override
        public int compareTo(Pair arg0){
            return this.distance - arg0.getDistance();
        }
    }
    public static List<List<Pair>> optimalUtilization(int maxTravelDist,
                                                      List<List<Integer>> forwardRouteList,
                                                      List<List<Integer>> returnRouteList) {
        PriorityQueue<Pair> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        Queue<String> q = new LinkedList<>();
        while (!q.isEmpty()){
            
        }
        List<List<Pair>> pairs = new ArrayList<>();
        for(List<Integer> fList : forwardRouteList){
            for(List<Integer>rList: returnRouteList){
                if(rList.get(1)+fList.get(1)<=10000) {
                    List<Integer> cordinate = new ArrayList<>();
                    cordinate.add(fList.get(0));
                    cordinate.add(rList.get(0));
                    Pair pair = new Pair(cordinate, rList.get(1) + fList.get(1));
                }
            }
        }
        return pairs;

    }
}
