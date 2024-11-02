package Avalara;

import java.util.Arrays;
import java.util.Collections;

public class Watergarden1326{
    public static int mintap(int N,int[] arr){
        int[] temp = new int[N+1];
        int sum=0;
        int count =0;
        for(int i=0;i<=N;i++){
            int a = (i-arr[i]); int b = (i+arr[i]);
           temp[i] = Math.abs(a-b);
           //System.out.println(temp[i]);
        }
        for(int i=0;i<=N;i++){
            Arrays.sort(temp,);
            sum = sum + temp[i];
            System.out.println(sum);
            if(sum>=N){
                count++;
                return count;
            }
            count++;


           
       }
       return -1;
    }
    public static void main(String[] args) {
        int N =7;
        int[] arr = {1,2,1,0,2,1,0,1};
        System.out.println(mintap(N, arr));
    }

}