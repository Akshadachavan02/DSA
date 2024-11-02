package ArrayList;

import java.util.ArrayList;

public class Maximumwater {
    public static int maxwater(ArrayList<Integer> arr){
        int max =0;
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                int height = Math.min(arr.get(i), arr.get(j));
                int weight = Math.abs(i-j);
                int current  = height*weight;
                max = Math.max(max, current);
            }
        }
        return max;

    }
    public static int optimizeapp(ArrayList<Integer> arr){
        int maxwater=0;
        int lp = 0;
        int rp = arr.size()-1;
        while (lp<rp) {
            int height = Math.min(arr.get(rp),arr.get(lp));
            int widht = Math.abs(lp-rp);
            int currarea = height*widht;
            maxwater = Math.max(maxwater, currarea);

            if(arr.get(lp)<arr.get(rp)){
                lp++;
            }else{
                rp--;}

                
            }
            return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(8);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(8);
        arr.add(3);
        arr.add(7);
        System.out.println(optimizeapp(arr));
         

    }
    
}
