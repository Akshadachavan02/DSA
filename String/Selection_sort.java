public class Selection_sort {
    public static void selection(int arr[]) {
        
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp;
            temp =arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,3,7,6};
        selection(arr);
    }
}
