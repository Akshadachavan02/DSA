import java.util.*;
public class Chocolaproblem {
    public static void main(String[] args) {
        int n =4 ;int m=6;
        Integer costvar[] = {2,1,3,1,4};
        Integer costHor[] = {4,1,2};

        Arrays.sort(costHor,Collections.reverseOrder());
        Arrays.sort(costvar, Collections.reverseOrder());

        int v=0 , h=0; //pointer for two arrays
        int horpic =1 , verpic =1; // horizonal and vertical picecs
        int cost =0;
        while(h < costHor.length && v < costvar.length ){
            if(costvar[v] <= costHor[h]){
                cost += (costHor[h] * verpic);
                h++;
                horpic++;
            }else{
                cost += (costvar[v] * horpic);
                v++;
                verpic++;
            }
        }
        while(h<costHor.length){
            cost += (costHor[h] * verpic);
            h++;
            horpic++;
        }
        while (v< costvar.length) {
            cost += (costvar[h] * horpic);
            v++;
            verpic++;
            
        }
        System.out.println("final cost is:"+cost);
    }
    
}
