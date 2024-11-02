package BackTraking;


public class Array_val {
    public static void array_recursive(int arr[],int i,int val) {
        //base case
        if(i>=arr.length){
            print(arr);
            return;

        }
        
        //the real work to be done
        arr[i] = val;
        array_recursive(arr, i+1, val+1);
        arr[i] = arr[i]-2;
        
    }
    
    public static void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        array_recursive(arr, 0, 1);
        print(arr);
        
    }
    
}
