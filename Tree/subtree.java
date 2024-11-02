public class subtree {

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
        public static boolean istree(Node root) {
            if()
            
        }
    }
    public static void main(String[] args) {
        int nodes= {};
        BinaryTree bt = new BinaryTree();
        Node root = new Node(nodes);
        bt.buildnode(root);
        
    }
    
}
