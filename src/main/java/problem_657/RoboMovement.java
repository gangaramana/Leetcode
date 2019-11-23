package problem_657;

public class RoboMovement {
    public static void main(String[] args) {
        RoboMovement r=new RoboMovement();
        System.out.println(r.judgeCircle("UDUDUDLRRL"));

    }

    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        char [] c=moves.toCharArray();
        for (int i=0;i<c.length;i++) {
            if (c[i]== 'U'|| c[i]=='L' || c[i]=='D'|| c[i]== 'R'){
                switch (c[i]){
                    case 'U':
                        y++;
                        break;
                    case 'D':
                        y--;
                        break;
                    case 'R':
                        x++;
                        break;
                    case 'L':
                        x--;
                        break;
                    default:
                        break;
                }
            }
        }
        return (x == 0 && y == 0);
    }
}
