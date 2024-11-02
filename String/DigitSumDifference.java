public class DigitSumDifference {
   public static int digitsum(int num){
    int sum =0;
    while (num>0) {
        sum += num%10;
        num = num /10;

        
    }
    return sum;

   }
   public static int diffrance(int m,int n){
    int sum4=0;int sum7 =0;
    for(int i=m;i<=n;i++){
        if(i%4==0){
            sum4 += digitsum(i);
        }
        if(i%7==0){
            sum7 += digitsum(i);
        }
    }
    return (int)Math.abs(sum4-sum7);
   }
   
    public static void main(String[] args) {
        int diif = diffrance(10, 20);
        System.out.println(diif);
    }
    
}
