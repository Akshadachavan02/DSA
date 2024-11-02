import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static int fracknap(int val[],int wt[],int w){
        double ratio[][] = new double[val.length][2];
        for(int i=0;i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)wt[i];
        }
        // sort array into ascending order
        int capacity =w;
        int finalval =0;
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
        for(int i=ratio.length-1;i>=0;i--){
            int ind = (int)ratio[i][0];
            if(capacity >= wt[ind]){
                finalval += val[ind];
                capacity -= wt[ind];
            }
            else{
                finalval += (ratio[i][1]*capacity);
                capacity =0;
                break;
            }
        }
        return finalval;
    }
    public static void main(String[] args){
        int val[] = {60,100,120};
        int wt[] = {10,20,30};
        int w = 50;
        System.out.println(fracknap(val,wt,w));
    }
    
}
