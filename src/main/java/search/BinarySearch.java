package search;

public class BinarySearch {
    public static void main(String[] args) {
        //input should be sorted array.
        int[] testInput = {1,2,3,5,6,7,8,9};
        System.out.println(search(testInput,9));

    }
    public static boolean search(int[] input, int searchValue){
        int right = input.length-1, left = 0;
        while (left<=right){
            int mid = left+(right-left)/2;
            if(searchValue == input[mid])
                return true;
            else if (searchValue<input[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return false;
    }
}
