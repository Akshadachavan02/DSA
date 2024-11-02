import java.util.Arrays;
import java.util.Comparator;

public class Maxchainselection {//O(nlogn)
    public static int selection(int pairs[][]){
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));
        int sum =1;
        int ChainEnd = pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(ChainEnd<pairs[i][0]){
                sum++;
                ChainEnd = pairs[i][1];
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        int pairs[][] ={{5,24},{39,60},{5,28},{27,40},{50,90}};
        System.out.println(selection(pairs));
    }
    
}
