import java.util.*;
public class CEOandPlot {
    public static int squareplot(int[] number){
        int count =0;
        for(int i=0;i<number.length;i++){
            int a = (int)Math.sqrt(number[i]);
            double a1 = Math.sqrt(number[i]);
           // System.out.println(a+" "+a1);
        if(a==a1){
            count++;
        }
    }
    return count;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(squareplot(arr));
        

    }
    
}
