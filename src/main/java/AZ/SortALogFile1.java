package AmazonInterViewQuestion;


import java.util.*;

/**
 * @project q
 * @authore dgunda on 5/12/18
 */
public class SortALogFile1 {

    public static class Loglines implements Comparable<Loglines>{
        String firstWord;
        String secoundWord;
        String actualLine;

        public Loglines(String s){
            this.firstWord = s.split(" ")[0];
            this.secoundWord = s.split(" ")[1];
            this.actualLine = s;
        }

        public String getFirstWord() {
            return firstWord;
        }

        public void setFirstWord(String firstWord) {
            this.firstWord = firstWord;
        }

        public String getSecoundWord() {
            return secoundWord;
        }

        public void setSecoundWord(String secoundWord) {
            this.secoundWord = secoundWord;
        }

        public String getActualLine() {
            return actualLine;
        }

        public void setActualLine(String actualLine) {
            this.actualLine = actualLine;
        }

        @Override
        public String toString() {
            return "Loglines{" +
                    ", actualLine='" + actualLine + '\'' +
                    '}';
        }

        public int compareTo(Loglines o) {
            return getFirstWord().compareTo(o.firstWord);
        }
    }
    public static List<String> reorderLines(int logFileSize, List<String> logLines){

        List<Loglines> list = new ArrayList<Loglines>();
        List<String> list2 = new ArrayList<String>();
        for (String log: logLines){
            list.add(new Loglines(log));
        }
        Collections.sort(list);
        for (Loglines log: list){
            System.out.println(log.actualLine);
        }
        for(Loglines log: list){
           list2.add(log.actualLine);
        }

        return list2;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("t1 12 13 14 ");
        list.add("a2 test test test");
        list.add("r1 52 32 54");
        list.add("w1 has first last");
        reorderLines(4, list);
    }

}
