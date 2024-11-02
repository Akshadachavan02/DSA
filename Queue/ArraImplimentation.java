package Queue;

//import Array_2d.new11;

public class ArraImplimentation {
    static class Queue{
         static int  arr[];
         static int  size;
         static int rare;
         Queue(int n){
            arr = new int[n];
            size = n;
            rare= -1;
        }
        public static boolean isEmpty(){
            return rare==-1;
        }
        public static void enqueue(int val){
            if(rare == size-1){
                System.out.println("Queue is full");
                return;
            }
            rare = rare+1;
            arr[rare] = val;
        }
        public static int dequeue(){
            if(isEmpty()){
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rare;i++){
                arr[i]  = arr[i+1];
            }
            rare = rare-1;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {
        Queue qu = new Queue(5);
        qu.enqueue(1);
        qu.enqueue(7);
        qu.enqueue(8);
       // qu.dequeue();
       while (!qu.isEmpty()) {
        System.out.println(qu.peek());
        qu.dequeue();
        
       }
    }
}
    
