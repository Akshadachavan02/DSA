package OOP;

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Akshada";
        s1.roll = 1234;
        // Student s2 = new Student(1234);
        // Student s3 = new Student();
        //System.out.println(s4.name);
        s1.marks[0] = 100;
        s1.marks[1] = 40;
        s1.marks[2] =80;
        Student s4 = new Student(s1); // s1 is copied into s2
        s1.marks[2] = 120;
        for(int i=0;i<3;i++){
            System.out.println(s4.marks[i]);
        }

        
    }
}

/**
 * InnerConstructors
 */
 class Student {
    String name;
    int roll;
    String password;
    int marks[];
    //aprameterized constructor
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    //non_parameterized 
    Student(){
        marks = new int[3];
        System.out.println("WELLCOME TO THE CLASS");
    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
    //copy constructor shallow copy 
    // Student(Student s1){
    //     marks = new int[3];
    //     this.marks = s1.marks;
    // }
    // deep copy constructor
    Student(Student s1){
        marks = new int[3];
        //this.marks = s1.marks;
        for(int i=0;i<3;i++){
            this.marks[i] = s1.marks[i];
        }

    }


    
}
