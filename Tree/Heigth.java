package Tree;


public class Heigth {

        public static int hei(buildnode root) {
            if(root==null){
                return 0;
            }
            
            int lh= hei(root.right);
            int rh = hei(root.left);
            return Math.max(lh, rh) +1;
     
    }
    public static void main(String[] args) {
      int node[] = {2,4,6,-1,-1,2,-1,-1,2,1,-1,6,-1,-1};
      buildnode bi = new buildnode(-1);
      buildnode root = bi.newnode(node);

      System.out.println(hei(root));

        
    }
    
}
