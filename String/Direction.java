package String;
import java.lang.String;

public class Direction {
    public static double dir(String dir){
        int x=0; int y=0;
        for(int i=0;i<dir.length();i++){
            if(dir.charAt(i)=='E'){
            x++;
            }
            if(dir.charAt(i)=='W'){
                x--;
            }
            if(dir.charAt(i)=='N'){
                y++;
                }
            if(dir.charAt(i)=='S'){
                y--;
            }

        }
        double sum = (x*x) + (y*y);
        return Math.sqrt(sum);

    }
    
    public static void main(String[] args){
        String dir = "WESN";
        System.out.println(dir(dir));


    }
}
    

