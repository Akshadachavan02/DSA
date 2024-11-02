package Queue;
import java.util.*;
public class Dequeue {
    static class stack{
        static Deque<Integer> dq = new LinkedList<>();
        public static boolean isempty(){
            return dq.isEmpty();
        }
        public static void push(int data){
            dq.addLast(data);
        }
        public static int pop(){
            return dq.removeLast();
        }
        public static int peek(){
           return  dq.getLast();
        }

    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isempty()) {
            System.out.println(s.pop());
            
        }
    }
    
}
