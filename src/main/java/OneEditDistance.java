public class OneEditDistance {
    public static void main(String[] args) {
        System.out.println(isOneDistanceAway("pale","palww"));
    }
    public static boolean isOneDistanceAway(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        if(Math.abs(m-n)>1){
            return false;
        }
        int i = 0;
        int j = 0;
        int count =0;
        while (i<m && j<n){
            if(s1.charAt(i) == s2.charAt(i)){
                i++;
                j++;
            }else{
                count++;
                if(count>1)
                    return false;
                if(m>n){
                    i++;
                }else if(m<n){
                    j++;
                }else {
                    i++;
                    j++;
                }
            }
        }
        if(i<m || j<n){
            count++;
        }
        if(count==1)
            return true;
        return false;
    }
}
