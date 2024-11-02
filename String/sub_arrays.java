public class sub_arrays {

    public static void sub(int arr[]) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    sum = sum+arr[k];
                    System.out.print(arr[k]+" ");
                }
                System.out.print("= "+sum);
                System.out.println();
                sum=0;
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
        int arr[]= {1,3,4,5,7,5,9,4};
        sub(arr);

    }
    
}
