public class equi {
    public static void main(String[] args) {
        int arr[]={1,2,3,8,1,2,3};
        for(int i=0;i<arr.length;i++){
            int j;
            
            int sum2=0;
            int sum1=0;
            for(j=i+1;j<arr.length;j++)
            {
                sum2=sum2+arr[j];
            }
            for(j=0;j<i;j++)
            {
                sum1=sum1+arr[j];
            }

            if(sum1==sum2){
                System.out.println(j);
                //break;
            }
        }
    }
}