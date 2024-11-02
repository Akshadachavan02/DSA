public class Recurrsion_x_power_efficient {
    
    public static int power(int n,int x) {
        if(x==0){
            return 1;
        }
        int halfpower = power(n, x/2) *power(n, x/2);
        if(x%2!=0){
            halfpower = n*halfpower;
        }
        return halfpower;
        
    }
    
    public static void main(String[] args) {
        int n=2;
        int x=5;
        System.out.println(power(n,x));
    }
    
}
