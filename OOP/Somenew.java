package OOP;

public class Somenew {
    public static void main(String[] args) {
        animal a1 = new child();
        a1.print1();
        
    }
    
}
class animal{
    void print1(){
        System.out.println("Iam a animal constructor");
    }
}
class child extends animal{
    void print(){
        System.out.println("i am a base class ");
    }

}
