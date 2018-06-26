package arrays;

import edu.princeton.cs.algs4.Stack;

/**
 * @project q
 * @authore dgunda on 5/29/18
 */
public class NextBigNumber {
    public static void main(String[] args) {
        int[] input = {11, 13, 21, 3, 5, 8};
        printNextBigInterger(input);
    }

    public static void printNextBigInterger(int[] a){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(a[0]);
        int next, element;
        for(int i=1; i<a.length;i++){
            next = a[i];
            if(!stack.isEmpty()) {
                element = stack.pop();

                while (element < next) {
                    System.out.println(element + " --> " + next);
                    if (stack.isEmpty())
                        break;
                    element = stack.pop();
                }
                if(element >next)
                    stack.push(element);
            }
            stack.push(next);
        }

        while (!stack.isEmpty()){
            element = stack.pop();
            next = -1;
            System.out.println(element + " --> " + next);
        }
    }
}
