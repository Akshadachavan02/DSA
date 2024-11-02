public class Recurrsion_x_power {
    
    public static int power(int x,int n) {
        if(n==0){
            return 1;
        }
        int num = power(x, n-1);
        return x* num;
        
    }
    public static void main(String[] args) {
       int  x =5;
        int n = 5;
        System.out.println(power(x, n));
    }
    
}
