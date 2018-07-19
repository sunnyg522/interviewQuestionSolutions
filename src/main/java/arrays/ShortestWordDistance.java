package arrays;

/**
 * Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.
 * For example,
 * Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
 * Given word1 = “coding”, word2 = “practice”, return 3.
 * Given word1 = "makes", word2 = "coding", return 1.
 * @project q
 * @authore dgunda on 7/18/18
 */
public class ShortestWordDistance {
    public static void main(String[] args) {
        String[] input = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding";
        String word2 = "practice";
        System.out.println(swd(input,word1,word2));
    }
    public static int swd(String[] in, String s1, String s2){
        int distance = Integer.MAX_VALUE;
        int m = -1;
        int n = -1;
        for(int i=0; i<in.length;i++){
            String temp = in[i];
            if(temp.equals(s1)){
                m = i;
                if(n!=-1)
                    distance = Math.min(distance, m-n);
            }else if(temp.equals(s2)){
                n = i;
                if(m!=-1)
                    distance = Math.min(distance, n-m);
            }
        }
        return distance;
    }
}
