import java.util.Scanner;

/**
 * Reverse_word
 */
public class Reverse_word {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String resstr = "";
        char ch;
        for(int i=0;i<str.length();i++){
            ch = str.charAt(i);
            resstr = ch+resstr;
        }
        System.out.println(resstr);

        
     }
    }