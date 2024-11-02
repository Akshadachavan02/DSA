package Array_2d;
public class Digonal_sum {
    public static int dia(int[][] mat) {
        int sum=0;
        /**  Time complexity = O(n*n)for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j){
                    //System.out.println(mat[i][j]);
                    sum= sum+mat[i][j];

                }
                else if(i+j==mat.length-1)
                {
                    //System.out.println(mat[i][j]);
                    sum = sum+mat[i][j];
                }
            }
        }
        return sum;*/
        for(int i=0;i<mat.length;i++){
            sum = sum +mat[i][i];
            if(i != mat.length-1-i){
                sum = sum+mat[i][mat.length-1-i];
            }
        }
        return sum;
        
    }
   
   
    public static void main(String[] args) {
    int[][] mat = {{1,2,3},{4,5,6,},{7,8,9}};
    System.out.println(dia(mat));
   }
    
}
