package StackandQueue;
import java.util.*;

public class pushbottem {
    public static void pushbottem(Stack<Integer> ss, int data){
        //base case 
        if(ss.isEmpty()){
            ss.push(data);
            return;
        }

        //work to be done
        int top = ss.pop();
        pushbottem(ss, data);
        ss.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer>  ss = new Stack<>();
        ss.push(2);
        ss.push(10);
        ss.push(56);

        pushbottem(ss,4);

        while(!ss.isEmpty()){
            System.out.println(ss.peek());
            ss.pop();
        }
    }
    
}
