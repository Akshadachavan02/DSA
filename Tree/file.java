package Tree;

public class file {
   public static void fun(int num) {
    if(num==101){
        return;
    }
    System.out.println(num+" ");
    num++;
    fun(num);
   }
   public static void add(int num,int num1){
    
   }
    public static void main(String[] args) {
        fun(0);
        
    }
    
}
