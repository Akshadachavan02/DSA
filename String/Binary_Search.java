public class Binary_Search {

    public static int BinarySearch(int arr[],int key) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start+end/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start = mid-1;
            }
            else{
                end = mid-1;
            }
            
        } 
        return -1; 
    }
    
    
    public static void main(String[] args) {
        int arr[] = {1,3,4,7,9,10,14,18,46};
        int key=18;
        System.out.println("number is at index"+BinarySearch(arr, key));

        
    }
    
}
