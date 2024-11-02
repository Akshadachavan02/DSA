package OOP;

public class Super {
    public static void main(String[] args) {
        horse h = new horse();
        System.out.println(h.name);
        animal a1= new animal();

        
    }
    
}
class animal{
    String name = "Mustanng";
    animal(){
        System.out.println("Animal can walk ");
    }
}
class horse extends animal{
    horse(){
        super.name = "THE FLORA";
        System.out.println("Can wins the race");
    }
}
