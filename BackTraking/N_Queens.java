//package BackTraking;

public class N_Queens {
    public static boolean isset(char bord[][],int row,int col) {
        //on same column
        for(int i=row-1;i>=0;i--){
            if(bord[i][col]=='Q'){
                return false;
            }
        }
     //on left diagonal
     for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(bord[i][j]=='Q'){
                return false;
            }

        }
     //on right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<bord.length;i--,j++){
            if(bord[i][j]=='Q'){
                return false;
            }
        }
        //System.out.println("hi");
        return true;

          
    }


    public static void N_que(char bord[][],int row) {
        //base case 
        if(row == bord.length){
            //System.out.println("hi");
            print_bord(bord);
            return;
        }


        //recursion set for column
        
        for(int i=0;i<bord.length;i++){
            if(isset(bord,row,i)==true){
                System.out.println("hi");
            bord[row][i] = 'Q';
            N_que(bord,row+1);

            bord[row][i] = 'x';

        }
    }

        
    }
    public static void print_bord(char bord[][]) {
        System.out.println("---------bord--------");
        for(int i=0;i<bord.length;i++){
            for(int j=0;j<bord.length;j++){
                System.out.print(bord[i][j]);

            }
            System.out.println();
        }

        
    }
    
    public static void main(String[] args){
        int n= 3;
        char bord[][] = new char[n][n];
        for(int i=0;i<bord.length;i++){
            for(int j=0;j<bord.length;j++){
                bord[i][j] = 'x';

            }
        }
        N_que(bord, 0);


    }
    
}
