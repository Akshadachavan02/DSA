package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Pairsum {
    public static void trival_p_pointer(ArrayList<Integer> arr,int sum){
        int lp,rp;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>arr.get(i+1)){
                rp =arr.get(i);
                lp =arr.get(i+1);
                while(lp!=rp){

            
                }
            }
        }
        
    }

    public static boolean pairsum(ArrayList<Integer> arr,int sum){
       // Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.size();j++){
                if((arr.get(i)+arr.get(j))==sum){
                    return true;

                }
            }
        }
        return false;

    }
    public static boolean pointer_2sum(ArrayList<Integer> arr,int sum){
        int right=arr.size()-1;
        int left =0;
        while(left!=right){
            int sum1 =arr.get(right) + arr.get(left);
            if(sum1==sum){
                System.out.println("("+arr.get(left)+","+arr.get(right)+")");
                return true;
            }
            else if(sum1>sum){
                right--;
            }
            else{
                left++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    
     ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(7);
        arr.add(9);
        arr.add(12);
        arr.add(15);
        int sum=9;
        System.out.println(pointer_2sum(arr, sum));
    }
    
}
