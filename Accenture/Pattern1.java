package Accenture;

public class Pattern1 {
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print(n);}
                // }else if(j==n-2 || i==n-2){
                //     System.out.print(n-1+" ");
                // }
                 else{
                    System.out.print(" ");
                }
                
                
            }
            System.out.println(" ");
        }
    }
    
}
