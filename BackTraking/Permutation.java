package BackTraking;

public class Permutation {
    public static void Per_arr(String sb,String  ans,int count) {
        
        //base case 
        if(sb.length()==0){
            System.out.println(ans);
            System.out.println(count);
            return;
        }
        
        //recursion
        for(int i=0;i<sb.length();i++){
            char a= sb.charAt(i);
            String new_str= sb.substring(0, i) + sb.substring(i+1);
            Per_arr(new_str, ans+a,count++);

        }




        //backtracking 

        
    }
    
    public static void main(String[] args) {
        String sb = "ABC";
        Per_arr(sb," ",1);

    }
    
}
