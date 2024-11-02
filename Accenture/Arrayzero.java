package Accenture;
import java.util.*;

public class Arrayzero {
   public static int quantunarr(int[] arr,int k){
    int x =0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>arr[k]){
            int a = arr[i] - arr[k];
            x = x + arr[i] - a;

        }
        else if(arr[i]<arr[k]){
            x= x+arr[i];

        }
        else{
            x = x+arr[i];

        }
    }
    return x;


    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int a = quantunarr(arr, k);
        System.out.println(a);

        
        
    }
    
}
