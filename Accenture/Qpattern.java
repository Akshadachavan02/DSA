package Accenture;

public class Qpattern {
    public static void main(String[] args) {
        int n=5;
        int a = n/2 +1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==2 || i==n-1 || j==2 || j==n-1 ){
                    if(i!=1 || j!=n || j!=1 || i!=n){
                        System.out.print(" *");
        
                    }
                    // else{
                    //     System.out.print(" ");
                    // }

                }
            else{
                System.out.print(" ");

            }
           
        }
        System.out.println();
        
    }
    
}
}
