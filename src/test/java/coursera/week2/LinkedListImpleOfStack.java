package coursera.week2;

import org.testng.annotations.Test;

public class LinkedListImpleOfStack {
    @Test
    public void testStack(){
        LinkedListImplOfStack stack = new LinkedListImplOfStack<String>();
        stack.push("test");
        stack.push("test2");
        stack.push("test3");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
