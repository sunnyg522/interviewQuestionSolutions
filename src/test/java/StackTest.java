import ds.Stack;
import org.testng.annotations.Test;

public class StackTest {

    @Test
    public void testPush(){
        Stack stack = new Stack(10);
        stack.push(10);
        stack.push(20);
        //stack.pirntStack();
        int temp = stack.pop();
        System.out.println(temp);
        System.out.println(stack.peek());
    }
}
