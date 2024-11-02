package Accenture;
import java.util.*;

public class Whitespaces {
    public static int  whitespace(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== ' '){
                count ++;

            }

        }
        return count;

    }
    
    public static void main(String[] args) {
        String str1 ="ASKDHADACHAVAN";
        String str2 = "as dfg egrg rgr grgr gr";
        int c =0;
        int a = whitespace(str1);
        int b = whitespace(str2);
        if(a>b){
            c = a-b;
        }
        else{
            c = b-a;
        }
        if(c%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
        
        
    }
    
}
