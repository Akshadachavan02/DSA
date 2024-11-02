public class Recursion {
    
    public static int factorial(int n) {
        if(n==0){
            return 1;
        }
        
        int fact_n = factorial(n-1);
        int fact_n1 = n*fact_n;

        return fact_n1;
        
    }
    
    public static void main(String[] args) {
        int n=5;
        System.out.println("factorial is::"+factorial(n));

    }
    
}
