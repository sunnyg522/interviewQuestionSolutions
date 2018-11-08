package arrays;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @project q
 * @authore dgunda on 7/18/18
 */
public class PermutationOfGivenArrayOfNumbers {
    public static Set<String> set = new HashSet<>();
    public static Set<String> set2 = new HashSet<>();
    public static void main(String[] args) {
        String input = "abcde";
        printPermutations(input,0,input.length()-1, set);
        set.forEach(System.out::println);
        String input2 = "abcde";
        printPermutations(input2, 0, input.length()-1,set2);
        set2.forEach(System.out::println);
    }
    public static void printPermutations(String str, int l, int r, Set<String> set){
        if(l==r) {
            set.add(str);
            return;
        }
        for(int i=1;i<=r;i++){
            str = swap(str,l,i);
            printPermutations(str, l+1, r, set);
            str = swap(str,l,i);
        }
    }
    public static String swap(String a, int i, int j){
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void printPermutations2(String str, int l, int r, Set<String> set){
        if(l==r){
            set.add(str);
            return ;
        }
        for (int i=1;i<=r;i++){
            str = swap(str, l, i);
            printPermutations2(str, l+1,r,set);
            str = swap(str, l, i);
        }
    }

}
