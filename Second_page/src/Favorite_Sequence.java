import java.util.Scanner;

public class Favorite_Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();

        for (short i = 0; i < test_cases; i++) {
            short n = scanner.nextShort();
            int[] array = new int[n];

            for (short j = 0; j < n; j++) {
                int b = scanner.nextInt();
                array[j] = b;
            }

            for (short j = 0; j < n / 2; j++) {
                System.out.print(array[j] + " ");
                System.out.print(array[n - j - 1] + " ");
            }

            // If n is odd, print the middle element
            if (n % 2 != 0) {
                System.out.print(array[n / 2]);
            }

            System.out.println();
        }
    }
}
