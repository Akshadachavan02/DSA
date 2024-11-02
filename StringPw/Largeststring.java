package StringPw;
public class Largeststring {
    public static void main(String[] args) {
        String str = " ";
        int j=0;
       int max =0;
        String ss = "" ; 
        for(int i=0;i<str.length();i++){
            if(!ss.contains(Character.toString(str.charAt(i)))){
               ss = ss+str.charAt(i);
            }
            else{
                int curr = ss.length();
                max = Math.max(max, curr);
                ss= "";
                ss = Character.toString(str.charAt(i));
            }

        }
        System.out.println(max);
        //System.out.println(ss);
    }
    
}
