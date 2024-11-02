package StackandQueue;

import java.util.Stack;

//import Array_2d.new11;

public class Reversestack {
    public static void pushbottem(Stack<Integer> s , int data){
        //base case 
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        // kaam
        int top = s.pop();
        pushbottem(s, data);
        s.push(top);
    }
    public static void revese(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        revese(s);
        pushbottem(s,top);
    }
    public static void printsack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        //printsack(st);
        revese(st);
        printsack(st);
        
    }
    
}
