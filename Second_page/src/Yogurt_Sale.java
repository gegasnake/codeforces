import java.util.Scanner;

public class Yogurt_Sale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++) {
            byte n = scanner.nextByte(), a = scanner.nextByte(), b = scanner.nextByte();
            if (a * 2 <= b){
                System.out.println(n * a);
            }else{
                System.out.println((n / 2) * b + (n % 2) * a);
            }

        }
    }
}
