package Accenture;

public class sortfirstoccurance {
    public static void main(String[] args) {
        int arr[] = {4,5,5,5,5,6,6,6,8};
        int target = 6;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(i);
                break;
            }
        }
    }
    
}
