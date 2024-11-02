package BackTraking;

public class Subsets_Str {
    
    
    
    public static void Sub_string(String str,int i,String str1) {
        //base case
        if(i>=str.length()){
            System.out.println(str1);
            return;
        }



        //if the choice of the charachter is yes
        Sub_string(str, i+1, str1+str.charAt(i));
        //if the character made the choice as no
        Sub_string(str, i+1, str1);
        
        
    }
    
    
    public static void main(String[] args) {
        int count =0;
        Sub_string("AKSHADA", 0," " );
        System.out.println(count);
        
    }
    
}
