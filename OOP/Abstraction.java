package OOP;


public class Abstraction {
    public static void main(String[] args) {
        // horse a1 = new horse();
        // a1.walk();
        // fish f1 = new fish();
        // f1.walk();
        //constructorr calling
       // mustang m1 = new mustang();
       animal a1 = new animal();

     
       
    }

    
}
abstract class animal{
    animal(){
        System.out.println("Animal constructor is called");
    }
    void east(){
        System.out.println("can eat");
    }
    abstract void walk();
}
class horse extends animal{
    horse(){
        System.out.println("horse constructor is called");
    }
    void walk(){
        System.out.println("Can run");
    }
}
class mustang extends horse{
    mustang(){
        System.out.println("Mustang is get called");
    }

}
class fish extends animal{
    void walk(){
        System.out.println("Can swim");
    }
}
