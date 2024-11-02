package Accenture;

public class NumOccurance {
    public static int  zero(int num){
        StringBuilder str = new StringBuilder();
        String nstr = Integer.toString(num);
        for(int i=0;i<nstr.length();i++){
            if(nstr.charAt(i)==48){
                str.append(5);
            }
            else{
                str.append(nstr.charAt(i));
            }
        }
        return Integer.parseInt(str.toString());
    }
    public static void main(String[] args) {
        System.out.println(zero(100000005));
        
    }
    
}
