public class Z_Pttern {
    static void print_z(int n){
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                if (row == 0 || row == n - 1 || column == n - 1 - row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   
      }
    
    public static void main(String[] args) {
        print_z(4);
    }
    
}
