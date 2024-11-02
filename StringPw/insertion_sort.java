package StringPw;
public class insertion_sort {
    public static void insertion(int arr[]) {
        for(int i=0;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
          
    }
    public static void main(String[] args) {
        int arr[] = {23,1,10,5,2};
        insertion(arr);

    }
    
}
