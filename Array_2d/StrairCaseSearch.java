package Array_2d;

public class StrairCaseSearch {
    public static boolean StairCase(int mat[][],int key) {
        int  ro =0;int col =mat[0].length-1;
        //int num = mat[ro][col];
        while(ro<mat.length && col>=0){
            if(key==mat[ro][col]){
                 System.out.print("("+col+","+ro+")");
                return true;
               
            }
            
            else if(key>mat[ro][col]){
                //System.out.println("jii");
                ro++;
            }
            else{
                col--;
            }

        }
        System.out.println("not found");
            return false;
        


        
    }
    public static void main(String[] args) {
        int mat [][]= {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=500;
        StairCase(mat, key);
    
    }
    
}
