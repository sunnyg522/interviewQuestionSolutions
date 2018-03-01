package coursera.week2;

import org.testng.annotations.Test;

public class BagTest {
    @Test
    public void testBag(){
        Bag<String>bag = new Bag<String>();
        bag.add("tests");
        bag.add("test2");
        bag.add("test3");
        for (String s: bag) {
            System.out.println(s);
        }
    }
}
