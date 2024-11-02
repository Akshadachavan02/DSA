package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Firstnonrepeating {
    public static void nonrepeating(String str){
        Queue<Character> q1 = new  LinkedList<>();
        int freq[]  = new int[26];// a to z
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            q1.add(c);
            freq[c-'a']++;
            while(!q1.isEmpty() &&  freq[q1.peek()-'a']>1){
                q1.remove();
            }
            if(q1.isEmpty()){
                System.out.print(-1+" ");
            }
            else{
                System.out.print(q1.peek() +" ");
            }
        }
        System.out.println();


    }
    public static void main(String[] args) {
        String str = "aabccb";
        nonrepeating(str);
    }
    
}
