package leetcode.bitwise;

/**
 * @project q
 * @authore dgunda on 12/16/18
 */
public class SmallestOfThreeNumberWithouComparator {
    public static void main(String[] args) {
        System.out.println(compareSmallesOfThree(2,3,4));
    }
    public static int compareSmallesOfThree(int a, int b, int c){
        int count = 0;
        while (a!=0 && b !=0 && c!=0){
            a--; b-- ; c--; count++;
        }
        return count;
    }
}
