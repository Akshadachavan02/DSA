import java.util.*;
public class Parkingslots {
    
    static int slots(char[] aa,int n){
        int curr_sum=0;
        int max_sum=0;
        if(n<0){
            return 0;
        }
        for(int i=0;i<n;i++){
            if(aa[i]=='S'){
                curr_sum++;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        char aa[] = ip.toCharArray();
        int n =ip.length();
        System.out.println(slots(aa,n));
        
    }
}
