package String.Bitmanipulation;

public class OddorEven {
    static void oddeven(int n){
        int bitmask =1;
        if((n & bitmask) == 0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
    static int getbit(int n ,int i){
        int bitmask =  1<<i;
        if((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        //oddeven(3);
        //oddeven(11);
        //oddeven(44);
        System.out.println(getbit(10, 2));
    }
    
}
