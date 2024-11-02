import java.util.Scanner;
import java.util.*;

public class ArrayCC {

    public static int update(int NUM[],int key) {
        for(int i=0;i<NUM.length;i++){
            if(NUM[i]>key){
                key = NUM[i];
            }
        }
        return key;
        
    }

    
    public static void main(String[] args) {
        int NUM[] = {98,99,100,4000,67,87,90,101};
        int key=Integer.MIN_VALUE;
    
        int ab= update(NUM, key);
        System.out.println("Lrgest element is"+ab);
    }


}
    

