
public class Kadanes {

    public static void Kadanes(int arr[]) {
        int sum=0;
        int max_sum = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
                sum +=arr[i] ;
                /*if(sum<0){
                    sum=0;
                }*/
                max_sum = Math.max(max_sum, sum);
        }
        System.out.println("Our Maximum sum is::"+ max_sum);
        
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        Kadanes(arr);
    }
    
}
