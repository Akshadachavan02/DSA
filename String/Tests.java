import java.util.Scanner;
public class Tests {
    public static void main(String[] args) {
        String[] fruit =new String[5];
        fruit[0] = "Mango";
        fruit[1] = "Banana";
        fruit[2] = "Apple";
        System.out.print("[");
        for(int i=0;i<fruit.length;i++){
            System.out.print(fruit[i]+" ,");
        }
        System.out.print("]");


        /*int num[] = new int[3];
        num[0] = 34;
        num[1] = 45;
        num[2] = 65;
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println(" ");
        num[2] = 100;
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }*/
    
        /*for(int i=0;i<nums.length;i++){
            Scanner sc = new Scanner(System.in);
            nums[i] = sc.nextInt();
        }
        for(int i=0;i<nums.length;i++){
           System.out.println(nums[i]);
        }*/
    }}
