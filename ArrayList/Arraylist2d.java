package ArrayList;

import java.util.ArrayList;

public class Arraylist2d {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> Mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(7);
        Mainlist.add(list);

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(7);
        a1.add(6);
        Mainlist.add(a1);


        for(int i=0;i<Mainlist.size();i++){
            ArrayList<Integer> aa = Mainlist.get(i);
            for(int j=0;j<aa.size();j++){
                System.out.print(aa.get(j)+" ");
                
            }
            System.out.println();

        }
        System.out.println(Mainlist);
        
        
        
    }
    
}
