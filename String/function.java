import java.util.*;
import java.util.Scanner;

/**
 * function
 */
public class function {
    public static int factorial(int a){
        int sum=1;
        for(int i=a;i>=1;i--){
            sum = i*sum;
        }
        return sum;
        
    }
    public static void main(String[] args){
        int num1;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("factorial of number is"+ factorial(num1));

    }

    
}