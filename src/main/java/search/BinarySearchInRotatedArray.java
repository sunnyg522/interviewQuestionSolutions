package search;

/**
 * @project q
 * @authore dgunda on 6/8/18
 */
public class BinarySearchInRotatedArray {
    public static void main(String[] args) {

    }
    public static boolean searchInRotatedArray(int[] input, int searchTerm){
        int r =0;
        int l = input.length-1;
        int mid = l+(l-r)/2;

        while (l<=r){
            if(input[mid] == searchTerm)
                return true;
//            if()
        }

        return false;
    }
}
