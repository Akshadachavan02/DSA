package Tree;
import java.util.*;

public class preorder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class info{
        Node root;
        int hd;
        info(Node root,int hd){
            this.root = root;
            this.hd = hd;
        }

    }
    static class BinaryTree{
        static int indx = -1;
        public static Node buildnode(int nodes[]){
            indx++;
            if(nodes[indx]==-1){
                return null;
            }
            Node newnode = new Node(nodes[indx]);
            newnode.left = buildnode(nodes);
            newnode.right = buildnode(nodes);

            return newnode;
        }
        public static void preorder(Node root) {
            if(root==null){
                return;
            }
            
            System.out.println(root.data+" ");
            preorder(root.left);
            preorder(root.right);

            
        }
        
        public static void inorder(Node root) {
            if(root==null){
                return;
            }
            inorder(root.left);
           System.out.println(root.data+" ");
            inorder(root.right);
            
        }
        public static void postorder(Node root) {
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data+" ");
            
        }
        public static int hei(Node root) {
            if(root==null){
                return 0;
            }
            
            int lh= hei(root.left);
            int rh = hei(root.right);
            return Math.max(lh, rh) +1;
        }
        public static int sum(Node root) {
            if(root == null){
                return 0;
            }
            int cl = sum(root.left);
            int rl = sum(root.right);
            int total = cl+rl+root.data;

            return total;

            
        }
        public static int count(Node root) {
            if(root==null){
                return 0;
            }
            int lc = count(root.left);
            int rc = count(root.right);
            return lc+rc+1;
           
        }
        static  class Info{
            Node root;
        }
        
        public static int diameter(Node root) {
            if(root==null){
                return 0;
            }
            int ld = diameter(root.left);
            int rd = diameter(root.right);
            int lh = hei(root.left);
            int rh = hei(root.right);
            int selfd = lh+rh+1;
            return Math.max(selfd, Math.max(ld,rd));
            
        }
        public static void BFS(Node root) {
            if(root==null){
                return;
            }
            Queue<Node> list = new LinkedList<>();
            list.add(root);
            list.add(null);
            while (!list.isEmpty()) {
                Node currnode = list.remove();
                if(currnode==null){
                    System.out.println();
                    if(list.isEmpty()){
                        break;
                    }else{
                    list.add(null);
                }
                }
                else{
                    System.out.print(currnode.data+" ");
                    if(currnode.left != null){
                        list.add(currnode.left);
                    }
                    if(currnode.right != null){
                        list.add(currnode.right);
                    }
                }
                
                
            }

            
        }
    }
    
    
    public static void main(String[] args) {
        int nodes[] = {2,4,6,-1,-1,2,-1,-1,1,-1,6,-1,-1};
        BinaryTree bi = new BinaryTree();
       Node root = bi.buildnode(nodes);
       //System.out.println(root.data);
       
       //bi.preorder(root);
       //bi.inorder(root);
      // bi.BFS(root);
       System.out.println(bi.diameter(root));
    }

    
}

