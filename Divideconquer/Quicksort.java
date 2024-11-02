package Divideconquer;

public class Quicksort {
    public static void qucksort(int arr[], int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        int pivitindx =calpivit(arr,si,ei);
        qucksort(arr, si, pivitindx-1);
        qucksort(arr, pivitindx+1, ei);
    }
    public static void printarra(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static  int calpivit(int arr[],int si,int ei){
        int piv = arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<piv){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temo= piv;
        arr[ei] = arr[i];
        arr[i] = temo;
        return i;

    }
    public static void main(String[] args) {
        int[] arr ={2,45,7,3,28,65,89,1};
       // int pivit = arr[arr.length];
        qucksort(arr,0,arr.length-1);
        printarra(arr);
    }
    
}
