import java.util.*;
public class Equlibriam {
    
    static int equ(int arr[],int n)
    {
        int sum =0;
        int ls=0,rs;
        for(int i=0;i<arr.length;i++){
            sum+= arr[i];
           // System.out.println(sum);
        }
        for(int i=1;i<arr.length-1;i++){
            ls = ls+arr[i];
            System.out.println(ls);
            rs = sum - arr[i];
            System.out.println(rs);
            if(ls==rs){
                return arr[i];
            }

        }
        return -1;

    }



    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        int a = equ(arr, n);
        System.out.println(a);
        
    }
    
}
