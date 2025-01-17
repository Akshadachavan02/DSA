package StackandQueue;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class stackusingqueue {
    static class queue{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();
        public static boolean isempty(){
            return q1.isEmpty() && q2.isEmpty();
        }
        public static void push(int data){//O(1)
            if(!q1.isEmpty()){
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }
        public static int pop(){//O(N)
            if(isempty()){
                return -1;
            }
            int top = -1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;

                    }
                    q2.add(top);
                }

            }else{
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                    
                }

            }
            return top;
        }
        public static int peek(){
            if(isempty()){
                return -1;
            }
            int top = -1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    q2.add(top);
                }

            }else{
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                    
                }

            }
            return top;
        }

    }
    public static void main(String[] args) {
        queue q = new queue();
        q.push(6);
        q.push(56);
        q.push(67);
        while(!q.isempty()){
            System.out.println(q.peek());
            q.pop();
        }

        
    }
    
}
