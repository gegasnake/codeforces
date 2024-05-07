import java.util.Scanner;
public class Wallet_Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++) {
            int a = scanner.nextInt(), b = scanner.nextInt();
            if ((a + b) % 2 == 0) {
                System.out.println("Bob");
            }else if ((a + b) % 2 == 1){
                System.out.println("Alice");
            }
        }

    }
}
