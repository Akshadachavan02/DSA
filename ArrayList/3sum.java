package ArrayList;

public class 3sum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> num = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums.length;j++){
                    for(int k=0;k<nums.length;k++){nums =
    [-1,0,1,2,-1,-4]
    Output
    [[-1,-1,2],[-1,0,1],[-1,1,0],[-1,2,-1],[-1,2,-1],[-1,-1,2],[0,-1,1],[0,0,0],[0,1,-1],[0,1,-1],[0,-1,1],[1,-1,0],[1,0,-1],[1,0,-1],[1,-1,0],[2,-1,-1],[2,-1,-1],[2,2,-4],[2,-1,-1],[2,-1,-1],[2,-4,2],[-1,-1,2],[-1,0,1],[-1,1,0],[-1,2,-1],[-1,2,-1],[-1,-1,2],[-4,2,2]]
    Expected
    [[-1,-1,2],[-1,0,1]] 
                        if(nums[i]+nums[j]+nums[k] ==0){
                            
                            List<Integer> l1 = new ArrayList<>();
                            l1.add(nums[i]);
                            l1.add(nums[j]);
                            l1.add(nums[k]);
                            num.add(l1);
                        }
                        
                    }
                }
            }
            return num;
            
        }
    }
    
}
