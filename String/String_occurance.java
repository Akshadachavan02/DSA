import java.util.*;
public class String_occurance {
    static void occ(String str){
        StringBuilder newstr = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                newstr.append("b");
            }
            else if(str.charAt(i)=='b') {
                newstr.append("a");
                
            } 
            else {
                newstr.append(str.charAt(i));
                
            }
            
        }
        System.out.println(newstr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        occ(str);
        
        
    }
    
}
