import java.util.Scanner;

public class Inversionpair {
    
    static void ipair(int arr[],int n){
        if(n<2){
            System.out.println("0");
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }
        
    }
    
    public static void main(String[] args) {
        int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]  = sc.nextInt();
    }
    ipair(arr, n);
    }
    
    
    
}
