import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name[] = new String[45];
        int num;
        System.out.println("enter the number of entries you want");
        num = scanner.nextInt();
        for(int i=0;i<num;i++){
            name[i] = scanner.nextLine();
        }
        for(int i=0;i<num;i++){
           System.out.println("names are"+name[i]);
        }
    }

    
}
