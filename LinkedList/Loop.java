package LinkedList;

import Array_2d.new11;

public class Loop {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = next;
        }
    }
    public static void removeloop(Node head){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null || fast.next = null){
            fast = fast.next.next;
             slow = slow.next;
            if(fast==slow){
                cycle = true;
                break;
            }
    
        }
        if(cycle==flase){
            return;
        }

        //meeting cell
        Node pre=null;
        while (fast != null || fast.next != null) {
            slow = slow.next;
            pre = fast;
            fast = fast.next; 
        }
        pre.next = null;

        // point last node to the null

    }
    public static void main(String[] args) {
        Loop ll = new Loop();
        Node head = new Node(1);
    }
    
}
