// public class Recurssion_fibonacci {
//     public static int fibonacci(int n) {
//         if(n==0 || n==1){
//             return n;
//         }
//         int fib1 = fibonacci(n-1);
//         int fib2 = fibonacci(n-2);
//         int finN = fib1+fib2;
//         return finN;
        
//     }
//     public static void main(String[] args) {
//         int  n = 50;
//         System.out.println(fibonacci(n));
//     }
    
// }
import java.util.*;
public class Recurssion_fibonacci {
    int fib(int n)
    {
         int first=0,second=1,third;
if(n==0 ||n==1)
{
    return n;
}
for(int i=2;i<=n;i++)
{
    third=first+second;
    first=second;
    second=third;
}
return second;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Recurssion_fibonacci r=new Recurssion_fibonacci();
        System.out.println("Enter te value of n:");
        int n= sc.nextInt();;
        System.out.println("Fibonnacii of "+n +" is:"+r.fib(n));

    }}
