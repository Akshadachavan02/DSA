package DP;

public class n_natural_numbers {
    public int  number(int n){
        if(n==1){
            return 1 ; //base case
        }
        int sum  = n + number(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n=100;
        n_natural_numbers nn = new n_natural_numbers();
        System.out.println(nn.number(n));
    }
}
