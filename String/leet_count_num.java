import java.lang.reflect.Array;
import java.util.Arrays;

public class leet_count_num {
    
    public static void nice_sub(int arr[],int key) {
        int tp=0;
        int[] arr1 = new int[key];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr[i] = 0; //even 
            }
            else{
                arr[i] = 1;
                tp++; //odd
                
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[] ={1,1,2,1,1};
        int key =3;
        nice_sub(arr, key);

    }
    
}
