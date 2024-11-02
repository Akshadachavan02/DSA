package OOP;

public class Encapsulation {
   public static void main(String[] args) {
    pen1 p1 = new pen1();
    p1.setcolor("bule");
    p1.settip(7);
    System.out.println(p1.getcolor());
    System.out.println(p1.gettip());
   }
    

    
}
//Use of acces modifer is called as encapsulation 
class pen1{
    private String color;
    private int tip;
    public void setcolor(String color){
        this.color = color;
    }
    public void settip(int tip){
        this.tip = tip;
    }
    public String getcolor(){
        return this.color;
    }
    public int gettip(){
        return this.tip;
    }
}

