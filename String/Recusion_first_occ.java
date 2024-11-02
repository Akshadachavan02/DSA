public class Recusion_first_occ {
    
   public static int occurance(int arr[],int key,int i) {
    if(i==arr.length-1){
        return -1;
    } 
        if(arr[i]==key){
            return i;
        }
        return occurance(arr, key, i+1);
    
   }
   public static int last_occurance(int arr[],int key,int i) {
    if(i==arr.length){
        return -1;
    }
    int found = last_occurance(arr, key, i+1);
    if(found==-1 && arr[i]==key){
        return i;
    }
    return found;


    
   }
    public static void main(String[] args) {
         int arr[] = {1,2,6,74,3,6,89,5,4,3,6,7,8,9};
         int key = 3;
         System.out.println(occurance(arr, key, 0));
         System.out.println(last_occurance(arr, key, 0));
    }
    
}
