package Array_2d;
import java.lang.String;
import java.util.Arrays;


public class Allens {
    public static int valu(int len,int[] arr1,int[] arr2) {
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    int ele = arr2[0] - arr1[0];
    return ele;
}
    
    
   /*  public static void main(String[] args){
        int[] arr1 = {2,1,9,7,4,5};   //by removing 4,5 the array will be {1,2,6} == if the value is 4 the array is {5,6,10}
        int[] arr2 = {3,11,9,6};
        int len = arr1.length;
        System.out.println(valu(len, arr1, arr2));
    }*/
    
}
