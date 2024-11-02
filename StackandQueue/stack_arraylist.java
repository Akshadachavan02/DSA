import java.util.ArrayList;

public class stack_arraylist {
   static class stack{
    static ArrayList<Integer> list = new ArrayList<>();
    //push function 
    static void push(int data){
        list.add(data);
    }
    //pop function
    static int pop(){
        if(isempty()){
            return -1;
        }
        int data = list.get(list.size()-1);
        list.remove(list.size()-1);
        return data;
    }
    //is empty
    static boolean isempty(){
        return list.size()==0;
    }
    // get peek of the stack
    static int peek(){
        return list.get(list.size()-1);
    }
   }
    
    public static void main(String args[]){
        stack ss = new stack();
        ss.push(4);
        ss.push(6);
        ss.push(10);
        while(!ss.isempty()){
            System.out.println(ss.peek());
            ss.pop();
        }

    }
    
}
