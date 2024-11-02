public class new1 {
    public static int maxSubArray(int[] nums) {
        int sum=0;
        int max_max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                for(int k=i;k<=j;k++){
                    sum += nums[i];
                }
                max_max= Math.max(sum,max_max);
                sum =0;

            }
        }
        return max_max;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
    
}
