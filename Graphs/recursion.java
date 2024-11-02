package Graphs;

public class recursion {
    public static int fun(int n){
        if(n==0){
            return 1;
        }
        //int ffm1 = fun(n-1);
        int fn = n*fun(n-1);
        return  fn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fun(n));
    }
    
}
