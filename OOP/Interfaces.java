package OOP;

public class Interfaces {
    public static void main(String[] args) {
        Rook r1 = new Rook();
        r1.moves();
    }
}

interface chessbord{
    void moves();

}
class king implements chessbord{
    public void moves(){
        System.out.println("up,down left righr by one place coz i am a king ");
    }

}
class Queen implements chessbord{
    public void moves(){
        System.out.println("Iam a quen i can do anything");
    }
}
class Rook implements chessbord{
    public void moves(){
        System.out.println("Iam a rook  i can do anything diagonally ");
    }
}