package Accenture;
public class SumofNegative {
       public static void main(String[] args) {
        int a=-3,b=7,c=-1,d =4;
        int sum=0;
        int[] arr = new int[4];
        arr[0] = a;arr[1] = b;arr[2] = c;arr[3]= d;
        for(int i=0;i<4;i++){
            if(arr[i]<0){
                sum = sum + Math.abs(arr[i]);
               // System.out.println(sum);
            }
        }
        System.out.println(sum);
        
    }
    
}
