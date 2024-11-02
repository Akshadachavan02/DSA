public class Reverse_Array {
    public static void reverse(int arr[]) {
        int last= arr.length-1;
        int first = 0;

        while(first<last){
        int temp = arr[last];
        arr[last]= arr[first];
        arr[first] = temp;
        first++;
        last--;

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
