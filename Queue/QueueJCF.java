package Queue;
import java.util.*;
public class QueueJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();  //ArrayDeque
        q.add(4);
        q.add(7);
        q.add(8);
        q.add(5);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
            
        }
    }
    
}
