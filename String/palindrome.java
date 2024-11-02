package String;
import java.util.*;
import java.lang.String;
public class palindrome {
    
    public static boolean palindrom(String name) {
        int n =name.length();
        for(int i=0;i<n/2;i++){
            if(name.charAt(i) != name.charAt(n-1-i)){
                return false;
            }

        }
        return true;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  name = sc.nextLine();
        System.out.println(palindrom(name));
        
    }
    
}
