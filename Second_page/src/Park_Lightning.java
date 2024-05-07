import java.util.Scanner;
public class Park_Lightning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            short n = scanner.nextShort(), m = scanner.nextShort();
            if ((n * m) % 2 == 0){
                System.out.println(n * m / 2);
            }else{
                System.out.println(n * m / 2 + 1);
            }
        }
    }
}
