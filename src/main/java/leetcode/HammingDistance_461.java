package leetcode;

/**
 * @project q
 * @authore dgunda on 11/15/18
 */
public class HammingDistance_461 {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        String a1 = String.format("%16s", Integer.toBinaryString(a));
        String b1 = String.format("%16s", Integer.toBinaryString(b));
        System.out.println(getHammingDistance(a1, b1));
        System.out.println(getHammingDistance2(a,b));
        System.out.println(getHammingDistance2Opt(a,b));
    }
    public static int getHammingDistance(String a, String  b){
        int count = 0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) != b.charAt(i))
                count++;
        }
        return count;
    }
    public static int getHammingDistance2(int a, int b){
        int temp = a^b;
        int count = 0;
        while (temp!=0){
            if((temp&1) == 1)
                count++;
            temp = temp>>1;
        }
        return count;
    }
    public static int getHammingDistance2Opt(int x, int y){
        int temp =  x^y;
        int count = 0;
        while (temp!=0){
            if((temp&1) == 1)
                count++;
            temp = temp>>1;
        }
        return count;
    }
}
