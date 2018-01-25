package hr;

public class MacOccuranceOfChar {
    public static void main(String[] args) {
        String test = "aaadsgasdgasdaaadijojoijbbbbbbbbbbbbbbbbb";
        getMaxOccurChar(test);
    }
    public static void getMaxOccurChar(String s){
        int[] input = new int[256];
        if(s.equals(null))
            throw new NullPointerException("null String");
        for(char c: s.toCharArray()){
            input[c]++;
        }
        int maxCount = 0;
        int indexValue = 0;
        for(int i=0;i<256;i++){
            if(input[i] >maxCount){
                maxCount = input[i];
                indexValue = i;
            }
        }
        System.out.println(((char)indexValue));
    }
}
