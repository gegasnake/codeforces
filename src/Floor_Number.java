import java.util.Scanner;

public class Floor_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the number of test cases
        short t = scanner.nextShort();

        for (short i = 0; i < t; i++) {

            short n = scanner.nextShort();
            short x = scanner.nextShort();

            short floorNumber;
            if (n <= 2) {
                floorNumber = 1;
            } else {
                floorNumber = (short) ((n - 2 + x - 1) / x + 1);
            }

            System.out.println(floorNumber);
        }

        scanner.close();
    }
}
