package bitManipulation;

/**
 * @project q
 * @authore dgunda on 6/10/18
 */
public class SubsetOfAnArray {
    public static void main(String[] args) {
        char[] a = {'a','b','c','d'};
        subSet(a);
    }
    public static void subSet(char[] a){
        int n = a.length;
        System.out.println(1<<n);
        for (int i =0;i<(1<<n);i++){
            System.out.print("{");
            for(int j=0;j<n;j++){
                if((i&(1<<j))>0)
                    System.out.print(a[j]+"");
            }
            System.out.println("}");
        }
    }
}
