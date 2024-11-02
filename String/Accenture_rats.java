import java.util.*;

public class Accenture_rats {
    
    static int food_suffi(int arr[],int unit,int r){
        if(arr == null){
            return -1;
        }
        int c = r*unit;
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            if(sum>=c)
        {
            return i+1;
        }
        }
        return 0;
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       System.out.println(food_suffi(arr, unit, r));


    }
    
}
