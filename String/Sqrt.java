public class Sqrt {

        public static int sumsq(int m,int n){
            int evensum=0, oddsum =0;
            for(int i=m;i<=n;i++){
                ///int sq = (int)Math.sqrt(i);
                if(i%2==0){
                    evensum += (int)Math.sqrt(i);
                }
                else{
                    oddsum+= (int)Math.sqrt(i);
                }
            }
            return (int)Math.abs(evensum-oddsum);
        }
        
        public static void main(String[] args) {
           int sumdiff = sumsq(1,10);
           System.out.println(sumdiff);
        }
        
    }

