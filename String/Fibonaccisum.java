public class Fibonaccisum {
    public static int fibsum(int n,int m){
        if(n==0){
            return 0;
        }
        int[] fib = new int[m+1];
        int sum =0;
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2;i<=m;i++){
            fib[i] = fib[i-1] + fib[i-2];
            //System.out.println(fib[i]);
            if(i>=n){
                sum += fib[i];
            }

        }
        return sum;

    }
    public static void main(String[] args) {
        int a = fibsum(2, 8);
        System.out.println(a);
        
    }
    
}
