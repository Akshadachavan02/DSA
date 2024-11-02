package Accenture;

public class Butterflypattern {
    public static void main(String[] args) {
        int n=7;
        int half =(n+1)/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 || j==n || i==half  || (i==j) || (i+j) == n+1 ){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");

                }

            }
            System.out.println();
        }
    }
    
}
