package StackandQueue;

import java.util.Stack;

public class Next_grater {
    public static void grather(int arr[],int[] grat){
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                grat[i] = -1;
            }else{
                grat[i]= arr[s.peek()];
                
            }
            s.push(i);

        }
    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int grat[] = new int[arr.length];
        grather(arr,grat);
        for(int i=0;i<grat.length;i++){
            System.out.print(grat[i]);
        }


    }
    
}
