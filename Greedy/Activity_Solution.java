public class Activity_Solution {
    public static int coutact(int start[] ,int end[]){
        int count =1;
        int en=0;
        for(int i =1;i<end.length;i++){
            if(start[i]>end[en]){
                count++;
                en++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int start[] = {1,3,2,5};
        int end[] = {2,4,3,6};
        System.out.println(coutact(start,end));
    }
    
}
