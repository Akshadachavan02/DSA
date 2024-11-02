package DP;

public class finboci {
    public int fibdp(int n,int dp[]){
        if(n==0 || n==1){
            return n;   //base case
        }
        if(dp[n]!=0){     // the value is already calculated by function
            return dp[n];
        }
        dp[n]  = fibdp(n-1, dp) + fibdp(n-2, dp);
        return dp[n];



    }
    public static void main(String[] args) {
        finboci ff = new finboci();
        int n = 10;
        int dp[] = new int[n+1];
        System.out.println(ff.fibdp(n,dp));
    }
    
}
