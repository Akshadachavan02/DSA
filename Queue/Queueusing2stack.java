package Queue;

//import java.util.Queue;
import java.util.*;
public class Queueusing2stack {
     static class queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        public static boolean isempty(){
            return s1.isEmpty();
        }
        public static void add(int data){
            while(!s1.isEmpty()){
                 s2.push(s1.pop());
            }
            s2.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            if(isempty()){
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){
            if(isempty()){
                return -1;
            }
            return s1.peek();
            
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.add(3);
        q.add(7);
        q.add(8);
        while(!q.isempty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
}
