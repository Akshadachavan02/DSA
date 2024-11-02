public class leet {
    public static void  index(int arr[],int target) 
    {
        int ans[] = new int[4];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                int sum = arr[i]+arr[j];
                if(sum==target){
                   ans[0] = i;
                   ans[1] = j;
                    
                }
            }
        }
        for(int i=0;i<2;i++){
            System.out.print(ans[i]+" ");
        }
    

        
    }
    public static void main(String[] args) {
     int arr[]= {2,3,4,5,67,8};
     int target = 75;
     index(arr, target);
    }
    
}
