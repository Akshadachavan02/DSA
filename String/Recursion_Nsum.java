public class Recursion_Nsum {
    public static int Sum(int n) {
        if(n==1){
            return 1;
        }
        int sum = Sum(n-1);
        int sun_final = n+sum;
        return sun_final;
        
        
        
        
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(Sum(n));
    }
    
}
