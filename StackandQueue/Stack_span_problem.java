package StackandQueue;

import java.util.Stack;

public class Stack_span_problem {
    public static  void calspan(int[] arr,int[] span){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        
        for(int i=1;i<arr.length;i++){
            int currval = arr[i];
            while(!s.isEmpty() && currval > arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevhigh = s.peek();
                span[i] = i-prevhigh;
            }
            s.push(i);

        }
    }
    public static void main(String[] args) {
        int arr[] = {100,80,60,70,60,85,100};
        int span[] = new int[arr.length];
        calspan(arr,span);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }

    }
    
}
