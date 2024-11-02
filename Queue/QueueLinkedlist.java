package Queue;

public class QueueLinkedlist {
    static class node{
        int data;
        node nxt;
        node(int data){
            this.data = data;
            this.nxt = null;
        }
        static node front=null;
        static node rear=null;
        public static boolean isEmpty(){
            return (front==null && rear == null);
        }
        public static  void add(int data){
            node temp = new node(data);
            if(front==null && rear == null){
                front=rear=temp;
            }
            rear.nxt = temp;
            rear = temp;
        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            node temp = front;
            front = front.nxt;
            return temp.data;

        }
        public static int peek(){
         if(isEmpty()){
            return -1;
         }
         return front.data;
        }
        // public static void printq(){
        //     if(isEmpty()){
        //         System.out.println("queue is empty");
        //         return;
        //     }

        //     while (!isEmpty()) {
        //         node temp = front;
        //         front = front.nxt;
        //         System.out.println(temp.data);
                
        //     }
        // }
    
    }

    public static void main(String[] args) {
        node n = new node(4);
        n.add(6);
        n.add(8);
        n.add(7);
       // n.printq();
        n.remove();
        n.add(9);
        n.add(80);
        n.remove();
        //n.printq();
        while (!n.isEmpty()) {
           System.out.println(n.peek());
           n.remove();
        }


    }
    
}
