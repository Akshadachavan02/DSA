package LinkedList;

public class Linklist {
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
    public void addlast(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.nxt = newnode;
        tail = newnode;
        size++;
    }
    public void printlk(){
        Node tep = head;
        //tep= head;
        while(tep!=null){
        System.err.print(tep.data + "->");  // print the current data
        tep= tep.nxt;  // point to the next nodes pointer
        }
        System.out.println("null");
    }
    public void add_middle(int idx,int data){
        Node newnode = new Node(data);
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp = temp.nxt;
            i++;
        }
        newnode.nxt = temp.nxt;
        temp.nxt = newnode;
        size++;
    }
    public void removefirst(){
        if(head==null){
            System.out.println("LLis empty");
        }
        else if(size==1){
            int val = head.data;
            head=tail=null;
            size =0;
           // return val;
        }
        head = head.nxt;
        size--;
    }
    public  int  removelast(){
        if(size==0){
            System.out.println("LL is empty");
            return -1;
        }
        else if(size==1){
            int val = head.data;
            head=tail=null;
            size =0;
            return val ;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.nxt;
        }
        System.out.println(size);
        int val = prev.nxt.data;
        prev.nxt = null;
        tail = prev;
        size--;
        return val;
    }
    public int searchIterative(int key){
        if(size==0){
            System.out.println("LL is empty");
        }
        int i=0;
        Node temp =head;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp = temp.nxt;
            i++;

        }
        return -1;
    }
    public int helper(int key,Node head){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int ind = helper(key, head.nxt);
        if(ind ==-1){
            return -1;
        }
        return ind+1;
    }
    public int recursive_search(int key){
      return helper(key, head);
        
    }
    public void reverse_LL(){
        //initialize the tree variables 
        Node currnode = head;
        Node prenode = null;
        Node nextnode;
        while(currnode!=null){
            nextnode = currnode.nxt;
            currnode.nxt = prenode;
            prenode = currnode;
            currnode = nextnode;
        }
        head = prenode;
    }
    public  void remove_n(int n){
        int sz =0;
        Node temp = head;
        while(temp!=null){
            temp = temp.nxt;
            sz++;
        }

        if(sz==n){
            head = tail =null;
            sz=0;
        }
        int i=1;
        Node prev = head;
        while(i<sz-n){
            prev = prev.nxt;
            i++;
        }
        prev.nxt = prev.nxt.nxt;
     }
    public Node slow_fast(Node head)
    {
        if (head == null || head.nxt == null) {
            return head;  // Return head if list is empty or has only one element
        }
        Node slow=head;
        Node fast = head;
        while(fast!=null && fast.nxt != null){
            slow = slow.nxt;
            fast  = fast.nxt.nxt;
        }
        return slow;

    }
    public boolean palindrome(){
        if(head  == null || head.nxt==null){
            return true;
        }
        // find the mid 
        Node mid = slow_fast(head);

        // reverse the middle half
        Node curr = mid;
        Node pre = null;
        Node next;
        while(curr!=null){
            next = curr.nxt;
            curr.nxt = pre;
            pre = curr;
            curr = next;
        }

        // check if they are equal or not
        Node left = head;
        Node right = pre;
        while(right!=null){
        if(right.data != left.data){
            return false;
        }
        right = right.nxt;
        left = left.nxt;
    }
    return true;
}


public static void main(String[] args) {
    Linklist ll = new Linklist();
    // ll.addfirst(3);
    // ll.addfirst(6);
    // ll.addlast(9);
    // ll.addlast(100);
    // //ll.printlk();
    // ll.add_middle(2, 12);
    // System.out.println("Original LL");
    // ll.printlk();
    //System.out.println(size);
//     ll.removefirst();
//     System.out.println("after removing first");
//    ll.printlk();
//    ll.removelast();
//    System.out.println("after removing last");
//    ll.printlk();
//    System.out.println(ll.searchIterative(100));
//    System.out.println(ll.searchIterative(90));
 //System.out.println(ll.recursive_search(6));
   // ll.reverse_LL();
  // ll.remove_n(3);
   // ll.printlk();
   ll.addfirst(1);
   ll.addlast(2);
   ll.addlast(2);
   //ll.addlast(1);
   System.out.println(ll.palindrome());
   
}
}
