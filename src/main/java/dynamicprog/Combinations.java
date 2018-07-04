package dynamicprog;

/**
 * @project q
 * @authore dgunda on 6/28/18
 */
public class Combinations {
    public static void main(String[] args) {

    }
    public void combinations(int[] elements, int sizeOfCom, int i, int totalElements, int index){


        if (sizeOfCom == index){

        }
        if(i>=totalElements)
            return;
        combinations(elements, sizeOfCom, i,totalElements, index+1);
    }
}
