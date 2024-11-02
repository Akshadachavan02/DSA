package String;
public class SumSqrt {
    public static int sumsq(int m,int n){
        int evensum=0, oddsum =0;
        for(int i=m;i<n;i++){
            int sq = (int)Math.sqrt(i);
            if(sq%2==0){
                evensum = sq+evensum;
            }
            else{
                oddsum = sq+oddsum;
            }
        }
        return (int)Math.abs(evensum-oddsum);
    }
    
    public static void main(String[] args) {
       int sumdiff = sumsq(1,10);
       System.out.println(sumdiff);
    }
    
}
