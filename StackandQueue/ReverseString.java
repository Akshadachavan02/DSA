package StackandQueue;
import java.util.*;
public class ReverseString {
    public static String reversestr(Stack<Character> ss,String str){
        int ind =0;
        while(ind<str.length()){
            ss.push(str.charAt(ind));
            ind++;
        }
        StringBuilder str1 = new StringBuilder("");
        while (!ss.isEmpty()) {
            str1.append(ss.pop());
        }
        return str1.toString();
    }
    public static void main(String[] args) {
        
        Stack<Character> ss = new Stack<>();
        String str = "ASkshada";
        String sresult = reversestr(ss, str);
        System.out.println(sresult);
    }
}
