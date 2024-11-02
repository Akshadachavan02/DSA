package Tree;
import java.util.*;

public class buildnode {
    int data;
    buildnode left;
    buildnode right;
    buildnode(int data ){
        this.data = data;
        this.left = null;
        this.right = null;

    }

    static int indx =-1;
    public buildnode newnode(int[] nodes){
        indx++;
        if(nodes[indx]==-1){
            return null;
        }
        buildnode bi = new buildnode(nodes[indx]);

        bi.left = newnode(nodes);
        bi.right = newnode(nodes);

        return bi;
        

    }
    
}
