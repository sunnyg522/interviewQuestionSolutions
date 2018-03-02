package coursera.week2.Assigment2;

public class Permutation {
    public static void main(String[] args) {
        String test = "xyz";
        permutation("zyx");
    }

    public static void permutation(String s){
        permutation("", s);
    }

    private static void permutation(String perm, String word){
        if(!word.equals("")){
            System.out.println(perm+word);
        }
        for(int i=0; i<word.length();i++){
            permutation(perm+word.charAt(i),word.substring(0,i)+word.substring(i+1,word.length()));
        }
    }

}
