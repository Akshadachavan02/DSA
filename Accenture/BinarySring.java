package Accenture;
import java.util.*;;

public class BinarySring {
    public static String returnchar(String str){
        int count=0;
       // System.out.println(str);
        StringBuilder str1 = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                //System.out.println(i);
                char apl = (char)('A' + count-1);
               // System.out.println(apl);
                str1.append(apl);
                count =0;
                

            }
            count++;

        }
        System.out.println(count);
        return str1.toString();
    }
    public static void main(String[] args) {
        
    String str = new String();
    Scanner sc = new Scanner(System.in);
    str = "11101011110";
    String finalstr = returnchar(str);
    System.out.println(finalstr);
  // System.out.println(str.charAt(3));

    }



    
}
