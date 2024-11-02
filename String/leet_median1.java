import java.lang.reflect.Array;
import java.util.*;
public class leet_median1 {
    
    public static float toadd(int arr1[],int arr2[]) {
        int m= arr1.length;
        int n= arr2.length;
        int[] arr = new int[m+n];
        int i=0;
        int j =0;
        while (j<m) {
            arr[i] = arr1[j];
            i++;
            j++;
        }
        j=0;
        while (j<n) {
            arr[i] = arr2[j];
            i++;
            j++;
        }
        Arrays.sort(arr);
        int len = arr.length/2-1;
        int len1 = arr.length/2;

        if(arr.length%2==0){
           float  mid = (float) ((arr[len]+arr[len+1])/2.0);
           return mid;
        }
        else{
            System.out.println("hii");
            return arr[len1];
        }
        

    }
    public static void main(String[] args) {
       
        int arr1[] = {1,3};
        int arr2[] = {2};
        System.out.println(toadd(arr1, arr2));

    }
    
}
