package coursera.week2.Assigment2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Permutation {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        //Deque<String> queue = new Deque<String>();
        RandomizedQueue<String> queue = new RandomizedQueue<String>();
        while (StdIn.hasNextLine() && !StdIn.isEmpty()) {
            //queue.addLast(StdIn.readString());
            queue.enqueue(StdIn.readString());
        }
        for (int i = 0; i < k; i++) {
            StdOut.println(queue.iterator().next());
        }
    }

    //
//    public static void permutation(String s) {
//        permutation("", s);
//    }
//
//    private static void permutation(String perm, String word) {
//        if (!word.equals("")) {
//            System.out.println(perm + word);
//        }
//        for (int i = 0; i < word.length(); i++) {
//            permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
//        }
//    }
    private static void permutation(String[] args) {

    }
}
