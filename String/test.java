public class test{
    public static void reverse(int arr[]) {
        int last= arr.length-1;
        for(int i=0;i<arr.length/2;i++){
        int temp = arr[i];
        arr[i]= arr[last-i];
        arr[last-i] = temp;
       
    }
    
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,56,7};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

        
    }
    
}
