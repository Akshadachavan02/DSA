public class Bubble_sort {
    public static void bubble(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int swap=0;
            for(int j=0+1;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        
    }
    
    public static void main(String[] args) {
        int arr[] = {1,4,5,6,3,7,8,5,2};
        bubble(arr);
    }
    
}
