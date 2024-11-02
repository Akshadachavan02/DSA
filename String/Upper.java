import java.lang.String;
import java.util.Scanner;

public class Upper {
    
    public static String first_upper(String name){
        StringBuilder sb = new StringBuilder(" ");
        sb.append(Character.toUpperCase(name.charAt(0)));
        for(int i=1;i<name.length();i++){
            if(name.charAt(i) == ' ' && i<name.length()-1){
               
                sb.append(name.charAt(i));
                i++;
                sb.append(Character.toUpperCase(name.charAt(i)));
            }
            else{
                sb.append(name.charAt(i));
            }

        }
        return sb.toString();
        
    }
    
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        String name = "akshada arya siddhi srusthi kaveri are good friends.";//sc.nextLine();
        System.out.println(first_upper(name));

    }
    
}
