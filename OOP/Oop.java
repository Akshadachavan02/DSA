package OOP; 

public class Oop{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Red");
        System.out.println(p1.getcolor());
        p1.settip(10);
        System.out.println(p1.getTip());
        Bankaccaunt bank = new Bankaccaunt();
        bank.username = "Akshada";
        bank.setpass("asdfghj");
        

    }

}
class Pen{
    private String colour;
    private int tip;
    String getcolor(){
        return this.colour;
    }
    int getTip(){
       return this.tip;
       
    }
    void setColor(String newcolor){
        colour = newcolor;
    }
    void settip(int newtip){
        tip = newtip;
    }

}
/**
 * InnerOop
 */
class Bankaccaunt{
    public String username;
    private  String password;  

    public void setpass(String pass){
        password = pass;
    }
}