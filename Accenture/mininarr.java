package Accenture;

public class mininarr {
    public static void main(String[] args) {
        int arr[] = {4,5,6,2,3};
        int min = Integer.MAX_VALUE;
        int minidx = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                minidx = i;

            }
        }
        System.out.println(minidx);
    }
    
}
