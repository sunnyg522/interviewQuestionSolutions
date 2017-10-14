import java.util.HashMap;

public class CharAndNumberOfRepetations {
    public static void main(String[] args) {
        String testInput = "daljdjfoafsfdoajfds";
        printCharAndNumberOfRep(testInput);
    }
    public static void printCharAndNumberOfRep(String s){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                int temp = map.get(s.charAt(i));
                temp = temp+1;
                map.put(s.charAt(i),temp);
            }
        }
        for(char m: map.keySet()){
            System.out.print(m);
            System.out.println(map.get(m));
        }
    }
}
