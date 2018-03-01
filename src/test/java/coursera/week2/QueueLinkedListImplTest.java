package coursera.week2;

import org.testng.annotations.Test;

public class QueueLinkedListImplTest {

    @Test
    public void testQueueApi(){
        QueueLinkedListImpl<String> q = new QueueLinkedListImpl<String>();
        q.enQueue("test");
        q.enQueue("testing");
        q.enQueue("testing");
        for (String t: q) {
            System.out.println(t);
        }
    }
}
