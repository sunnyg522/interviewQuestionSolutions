package coursera.week1.percolation;

public class ThreeSum {
    public static void main(String[] args) {
        int A[] = {-3,-1,0,1,10};
        System.out.printf(threeSumOfArray(A)+"");
    }

    public static boolean threeSumOfArray(int[] inputArray){
        int len = inputArray.length;
        for(int i =0; i<len ; i++){
            int j = i+1;
            int k = len-1;
            while (i<k){
                if(inputArray[i] +inputArray[j] +inputArray[k] == 0)
                    return true;
                else if(inputArray[i] +inputArray[j] +inputArray[k] < 0)
                    i++;
                else
                    k--;
            }
        }
        return false;
    }
}
