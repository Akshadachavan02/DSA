package Divideconquer;
// time complexict nlog(n)

public class MergeSort {
    public static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void  mergeelement(int arr[],int si,int mid ,int ei){
        int temp[] = new int[ei-si+1];
        int i=si;
        int j = mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        for(k=0 ,i=si;k<temp.length;i++,k++){
            arr[i] = temp[k];

        }


    }
    public static void merge(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        merge(arr, si, mid);
        merge(arr, mid+1, ei);
        mergeelement(arr,si,mid,ei);        
    }
    
    public static void main(String[] args) {
        int arr[] = {1,5,7,8,4,9,-2};
        merge(arr,0,arr.length-1);
        printarray(arr);
    }
 

    
}