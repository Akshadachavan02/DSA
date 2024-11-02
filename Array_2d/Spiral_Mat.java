package Array_2d;
import java.util.Scanner;

public class Spiral_Mat {
    
    public static void spiral(int[][] mat) {
        int Start_row = 0;
        int End_row = mat.length-1;
        int Start_col  =0;
        int End_col = mat[0].length-1;
            while (Start_row <= End_row && Start_col<=End_col) {
                for(int i=Start_col;i<End_col;i++){
                    System.out.print(mat[Start_row][i]+" ");
                }
                for(int i=Start_row;i<End_row;i++){
                    System.out.print(mat[i][End_col]+" ");
                }
                for(int i=End_col;i>Start_col;i--){
                    System.out.print(mat[End_row][i]+" ");
                }
                for(int i=End_row;i>Start_row;i--){
                    System.out.print(mat[i][Start_col]+" ");
                }
                Start_row++;
                Start_col++;
                End_col--;
                End_row--;

             }
    }
    
    
    public static void main(String[] args) {
        int[][] mat = new int[5][4];
        Scanner sc = new Scanner(System.in);
        int val;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                mat[i][j] = sc.nextInt();
            }

        }
        spiral(mat);

        
    }

    
}
