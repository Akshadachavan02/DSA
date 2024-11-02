package OOP;

public class Static {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setname("Akshda");
        student s2 = new student();
        s2.setname("Tushar");
        System.out.println(s1.getname());

    }

    
}
class student {
     static String name;
    int roll;
    void setname(String name){
        this.name = name;
    }
    String getname(){
        return this.name;
    }
}
