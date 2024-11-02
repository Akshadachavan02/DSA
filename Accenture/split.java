package Accenture;
import java.util.*;

public class split {
    
public static String changeInput(String str)
{
    String word[]=str.split(" ");
    StringBuilder sb=new StringBuilder();
    for(String s:word)
    {
        if(s.length()>=10)
        {
            String str1 = s.charAt(0) + String.valueOf(s.length()) + s.charAt(s.length() - 1);
            sb.append(str1).append(" ");
        }
        else {
            sb.append(s).append(" ");
        }
    }
    return  sb.toString().trim();
}
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        str=sc.nextLine();
        System.out.println(changeInput(str));
    }
}
    

