package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @project q
 * @authore dgunda on 2019-06-20
 */
public class FizzBuzz_412 {
    public static void main(String[] args) {

    }
    public List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){

            if(i%3 == 0 && i%5 == 0)
                list.add("FizzBuzz");
            else if(i%3 == 0)
                list.add("Fizz");
            else if(i%5 == 0)
                list.add("Buzz");
            else
                list.add(Integer.toString(i));
        }
        return  list;
    }
}
