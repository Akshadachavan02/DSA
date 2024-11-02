package String;
import java.lang.String;

public class Largest { 
    public static void main(String[] args) {
        String fruit[] = {"Banana","Mango","Apple"};
        String largest = fruit[0];
        for (int i=1;i<fruit.length;i++){
            if(fruit[i].compareToIgnoreCase(largest)>0){
                largest = fruit[i];
            }
        }
        System.out.println(largest);
        
    }
    
}
