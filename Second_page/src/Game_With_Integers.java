import java.util.Scanner;
public class Game_With_Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        for (byte i = 0; i < test_cases; i++){
            short n = scanner.nextShort();
            if (n % 3 == 0){
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
        }
    }
}
