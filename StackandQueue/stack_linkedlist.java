package StackandQueue;
public class stack_linkedlist {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    static class stack{
        static  Node head = null;
        //isempty 
        static boolean isempty(){
            return head==null;
        }
        //push in the stack
        static void push(int data){
            Node newnode = new Node(data);
            if(head==null){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }
        // pop
        static int pop(){
            if(isempty()){
                return -1;
        }
            Node nn  = head;
            head  = head.next;
            return nn.data;

        }
        //peek
        static int peek(){
            if(isempty()){
                return -1;
        }
        return head.data;
            
        }
    }
    public static void main(String[] args) {
        stack ss= new stack();
        ss.push(56);
        ss.push(38);
        ss.push(67);
        // while(!ss.isempty()){
             System.out.println(ss.peek());
        //     ss.pop();
        // }
        
    
    }
}
