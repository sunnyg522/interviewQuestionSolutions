package leetcode;

/**
 * @project q
 * @authore dgunda on 2019-07-07
 */
public class CompareVersionNumbers_165 {
    public static void main(String[] args) {
        System.out.println(compareVersion("0","1"));
    }
    public static int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");

        int i=0;
        while(i<arr1.length||i<arr2.length){
            if(i<arr1.length && i<arr2.length){
                if(Integer.parseInt(arr1[i])<Integer.parseInt(arr2[i])){
                    return -1;
                }else if(Integer.parseInt(arr1[i])>Integer.parseInt(arr2[i])){
                    return 1;
                }
            }else if(i<arr1.length){
                if(Integer.parseInt(arr1[i])!=0)
                    return 1;
            }else if(i<arr2.length){
                if(Integer.parseInt(arr2[0])!=0)
                    return -1;
            }
            i++;
        }
        return 0;
    }
}
