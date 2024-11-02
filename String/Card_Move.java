public class Card_Move {
    
    public static int[] moves(int start,int last,String abc) {
         int x = start;
         int y= last;
         for(char move : abc.toCharArray()){
            switch (move) {
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                   y++;
                   break;
                case 'D':
                  y--;
                  break;
            
                default:
                  System.out.println("Invalid Move:"+move);
                    break;
            }
         }
         return new int[]{x,y};


        }
    
    
    public static void main(String[] args) {
        String abc = "RRLRRUUDU";
        int start = 0;
        int last =0;
        int[] finialposition = moves(start, last, abc);
        System.out.println("("+finialposition[0]+","+finialposition[1]+")");

    }
    
}
