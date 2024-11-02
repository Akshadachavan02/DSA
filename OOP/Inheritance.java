package OOP;

public class Inheritance {
    public static void main(String[] args) {
        // fish f1 = new fish();
        // f1.eat();
        Dog d1 = new Dog();
        d1.breed();
        d1.Legs(4);
    }

    
}
class animal{
    void eat(){
        System.out.println("Eats");
    }
    void breaths(){
        System.out.println("breaths");
    }

}
// class fish extends animal{
//     int fin;
//     void swim(){
//         System.out.println("Swims");
//     }

// }
class maammel extends animal{
    int legs;
    void Legs(int legs){
        this.legs = legs;
        System.out.println("number of legs" +legs);
    }
}
class Dog extends maammel{
    String breed;
    void breed(){
        System.out.println("Greman Sheferd");
    }
}
