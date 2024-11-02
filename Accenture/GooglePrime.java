package Accenture;
import java.util.*;

public class GooglePrime {
    public static Boolean  googlepri(int num){
        int sum =0;
        String a = Integer.toString(num);
        for(int i=0;i<a.length();i++){
             sum = sum + (int)(a.charAt(i));
        }
        for(int i=2;i<sum;i++){
            if(sum %i==0){
                return false;
            }

        }


     return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(googlepri(num)==true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
        
        
    }
    
}
