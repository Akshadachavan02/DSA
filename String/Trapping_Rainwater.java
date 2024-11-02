class Trapping_Rainwater{
    
    public static int rain(int height[]){
        int n = height.length;
        int max_left[] = new int[n];
        int max_right[] = new int[n];
        max_left[0] = height[0];
        //calculate left max array
        for(int i=1;i<n;i++){
            max_left[i] = Math.max(max_left[i-1],height[i]);
        }
        //calculate right mx array
        max_right[n-1] = height[n-1]; 
        for(int i=n-2;i>=0;i--){
            max_right[i] = Math.max(max_right[i+1],height[i]);
        }
        //loop
        int tapwater=0;
        for(int i=0;i<n;i++){
            int waterlavel = Math.min(max_left[i],max_right[i]);
            tapwater = tapwater + waterlavel;

        }
        return tapwater;

    }
    public static void main(String[] args) {
        int height[]= {4,2,0,6,3,2,5};
   
        System.out.println(rain(height));
    }
}
