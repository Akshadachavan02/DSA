package LeetCode;

public class Jumpgame1 {
    public static boolean isposible(int jump[]){
        int dest = jump.length-1;
        //int len=1;
        for(int i=jump.length-2;i>=0;i--){
            if(i+jump[i]>=dest){
                dest = i;
            }

        }
        return dest==0;
    }
    public static void main(String[] args) {
        int jump[] ={1,1,2,5,2,1,0,0,1,3};
        System.out.println(isposible(jump));
    }
    
}
