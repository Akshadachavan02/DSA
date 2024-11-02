import java.lang.String;

public class Hasg {
    public static String hash(String name) {
        StringBuilder sb = new StringBuilder(" ");
        StringBuilder a = new StringBuilder("");
        for(int i=0;i<name.length();i++){
            if(name.charAt(i) == '#'){
                a.append(i);
            }
            else{
                sb.append(i);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String name = "A#k##AKK";
        System.out.println(hash(name));

    }
    
}
