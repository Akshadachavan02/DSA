import java.util.Scanner;

public class Aarray_sum {
    static int[] arr(int[] arr,int sum){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[i] + arr[j] == sum){
                    return new int[]{arr[i],arr[j]};
                }
            }

        }
        return null;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        int[]  a = arr(arr,sum);
        System.out.println("("+a[0]+","+a[1]+")");

    }
    
}
