package ds;

public class Stack {
    public int top;
    public int[] array ;
    public Stack(int size){
        this.top = 0;
        this.array = new int[size];
    }

    public void push(int value){
        array[top] = value;
        top++;
    }
    public int pop(){
        int temp = array[top-1];
        array[top-1] = 0;
        top--;
        return temp;
    }
    public void pirntStack(){
        int i = 0;
        while(i < top){
            System.out.println(array[i]);
            i++;
        }
    }
    public int peek(){
        return array[top-1];
    }
}
