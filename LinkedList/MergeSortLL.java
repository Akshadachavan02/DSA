package LinkedList;
import java.util.*;

public class MergeSortLL {
    public static class Node{
        int data;
        Node nxt;
    public Node(int data){
      this.data= data;
      this.nxt = null;
    }
}
public static Node head;
public static Node tail;
public static int size=0;
public void addfirst(int data){
    size++;
    Node newnode = new Node(data);
    if(head==null){
        head=tail=newnode;
        return;
    }
    
    newnode.nxt = head;

    head = newnode;

}
public Node getmid(Node head){
    Node slow = head;
    Node fast = head;
    while(fast!= null || fast.nxt != null){
        slow = slow.nxt;
        fast = fast.nxt.nxt;
}
return slow;
}
public Node mergesort(Node head){
    Node mid = getmid(head);
    Node righth = mid.next;
    mid.next = null;
    //now apply merge sort on left and right part of the LL
    Node NL = mergesort(head);
    Node RL = mergesort(righth);

    return merge(NL,RL);

}
public Node merge(Node head1 ,node head2){
    
}
    public static void main(String[] args) {
       MergeSortLL LL = new MergeSortLL();
       ll.addfirst(5);
       ll.addfirst(4);
       ll.addfirst(3);
       ll.addfirst(2);
       ll.addfirst(1);  

    }
    
}
