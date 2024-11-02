public class Tilling {
    public static int Tilling(int n) {
        //base case
        if(n==0 || n==1){
            return 1;
        }

        //for vertical 
        int ver = Tilling(n-1);
        //for horizontal
        int hor = Tilling(n-2);

        return  ver+hor;


        
    }
    
    public static void main(String[] args) {
        System.out.println(Tilling(4));
    }
    
}
