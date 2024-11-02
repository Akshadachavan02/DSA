import java.util.*;
public class move_zeros {
    
    public static void  Move_zaros(int arr[]) {
        int len = arr.length;
        int IP =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[IP] = arr[i];
                IP++;

            }
        }
        while ((IP<len)) {
            arr[IP] =0;
            IP++;
            
        }

       
        /*for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==0){
                    int temp =arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
         } 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }*/
    }
    public static void main(String[] args) {
        int arr[] = {1,0,3,0,5,6,0,8,7};
        Move_zaros(arr);
        //output = {1,3,5,6,8,7,0,0,0}
        System.out.println(Arrays.toString(arr));
    }
    
}
