import java.lang.String;
public class Music_teachure {
    public static int cal(String str) 
    {
        Integer count=1;
        StringBuilder str1 = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            for(int j=1;j<str.length()-1;j++){
                if(str.charAt(j)==str.charAt(i)){
                    count++;
                }
            }
            str1.append(str.charAt(i));
            str1.append(count.toString());
        }

        
    }
    
    
    public static void main(String[] args){
        String str = "aabbcdef";

    }
}
