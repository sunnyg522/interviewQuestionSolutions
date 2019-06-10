package leetcode;

/**
 * @project q
 * @authore dgunda on 2019-04-23
 */
public class ConvertSecToWords {
    public static void main(String[] args) {
        System.out.println(converToWords(90001));
        System.out.println(converToWords(7200));
        System.out.println(converToWords(121));
        System.out.println(converToWords(30));
        System.out.println(converToWords(-3000));
    }
    public static String converToWords(int sec){
        if(sec <0)
            throw new IllegalArgumentException("Sec cannot be -ve");
        if(sec == 0)
            return "0 secounds";


        int[] t = new int[10];
        int temp = t.length;
        int min = sec / 60;
        sec = sec%60;
        int hours = min/60;
        min = min%60;
        int days = hours/24;
        hours = hours%24;
        int weeks = days/7;
        days = days % 7;

        StringBuilder sb = new StringBuilder();
        if(weeks == 1)
            sb.append(weeks+"week ");
        else if(weeks > 1)
            sb.append(weeks+"weeks ");

        if(days ==1 )
            sb.append(days+"day ");
        else if(weeks >1 )
            sb.append(days+"days ");

        if(hours == 1)
            sb.append(hours+"hour ");
        else if( hours > 1)
            sb.append(hours+"hours ");

        if(min ==1)
            sb.append(min+"min ");
        else if(min > 1)
            sb.append(min+"mins ");

        if(sec ==1)
            sb.append(sec+"second ");
        else  if( sec >1)
            sb.append(sec+"seconds");

        //System.out.println( "weeks: "+weeks+" days: "+days+" hours: "+hours+" minutes: "+ min+" sec :"+sec);
       return sb.toString();

    }
}
