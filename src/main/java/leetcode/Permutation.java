package leetcode;

/**
 * @project q
 * @authore dgunda on 2019-07-16
 */
public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        permute(str, 0, str.length()-1);
    }

    public static void permute(String s, int l, int r){
        if(l==r)
            System.out.println(s);
        for(int i=l;i<=r;i++){
            s = swap(s, l, i);
            permute(s, l+1, r);
            s = swap(s, l, i);
        }

    }

    public static String swap(String s, int a, int b){
        char[] str = s.toCharArray();
        char temp = str[a];
        str[a] = str[b];
        str[b] = temp;
        return String.valueOf(str);
    }
}
