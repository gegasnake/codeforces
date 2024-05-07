import java.util.Scanner;
public class Where_Is_A_Bishop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        for (byte i = 0; i < test_cases; i++){
            String[] board = new String[8];
            for (byte x = 0; x < 8; x++){
                String s = scanner.next();
                board[x] = s;
            }
            for (byte x = 0; x < 8; x++){
                for (byte y = 0; y < 8; y++){
                    if (board[x].charAt(y) != '#' || x == 0 || y == 0 || y == 7 || x == 7){
                        continue;
                    }else{
                        if (board[x - 1].charAt(y - 1) == '#' && board[x - 1].charAt(y + 1) == '#' && board[x + 1].charAt(y - 1) == '#' && board[x + 1].charAt(y + 1) == '#'){
                            System.out.println((x + 1) + " " + (y + 1));
                            break;
                        }
                    }
                }
            }
        }
    }
}
