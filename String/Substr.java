public class Substr {

public static void sub(String str1,String str2){
    int len1 = str1.length();
    int len2 = str2.length();
    
    if(len1>len2){
        for(int i=0;i<len2;i++){
            for(int j=0 ;j<len1;j++){
                if(str2.charAt(i)==str1.charAt(j)){
                    String stra = str1.substring(i,len1);
                    str1.compareTo(str2);
                    

                }
            }
        }
    }
}
    public static void main(String[] args) {
        
    }
    
}
