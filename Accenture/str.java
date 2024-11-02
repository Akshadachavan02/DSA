package Accenture;
import java.util.*;

public class str {
    public static void  stringcheck(StringBuilder str){
        int len = str.length();
        if(len>10){
            System.out.print(str.charAt(0)+Integer.toString(len)+str.charAt(len-1) + " ");
        }
        else{
            System.out.print(str+" ");
        }

 
    }
    public static void main(String[] args) {
        StringBuilder newstr = new StringBuilder();
        String str  = "Shinig sun and Shootingstar";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                stringcheck(newstr);
                newstr =  new StringBuilder();
                continue;

            }else if (i == str.length() - 1){
                newstr.append(str.charAt(i));
                stringcheck(newstr);
                break;
            }
            newstr.append(str.charAt(i));
        }

    }
    
}