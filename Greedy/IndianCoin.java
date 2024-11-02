import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoin {
    public static int numnotes(Integer coins[],int money){
        int count =0;
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(coins,Comparator.reverseOrder());
        for(int i=0;i<coins.length;i++){
            if(money>=coins[i]){
                //count++;
                //money -= coins[i];
                while(money>=coins[i]){
                    count++;
                    ans.add(coins[i]);
                    money -= coins[i];
                }
            }
        }
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
        return count;

        
    }
    public static void main(String[] args) {
        Integer coins[] = {1,2,10,20,50,100,500,2000};
        int money =1234;
        System.out.println(numnotes(coins, money));

    }
    
}
