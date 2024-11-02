package Array_2d;
import java.util.*;

public class CountK {
    public static int countk(int[] arr,int k){
       // int digit =0;
        int flag =0;
        for(int i=0;i<arr.length;i++){
            String str =Integer.toString(arr[i]);
            int len = str.length();
           // System.out.println(len);
            if(len==k){
                flag++;
            }

        //System.out.println(flag);
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(countk(arr,k));
    }
    
}
