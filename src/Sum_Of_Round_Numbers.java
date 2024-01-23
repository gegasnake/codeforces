import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum_Of_Round_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();

        for (short i = 0; i < test_cases; i++) {
            int number = scanner.nextInt(); // Change data type to int
            List<Integer> list_of_numbers_to_add = new ArrayList<>();
            byte number_of_numbers_to_add = 0;
            short n = 0;

            while (number != 0) {
                if (number % 10 != 0) {
                    number_of_numbers_to_add++;
                    list_of_numbers_to_add.add((int) (Math.pow(10, n) * (number % 10)));
                }
                n++;
                number /= 10;
            }

            System.out.println(number_of_numbers_to_add);

            for (short x = 0; x < number_of_numbers_to_add; x++) {
                System.out.print(list_of_numbers_to_add.get(x) + " ");
            }

            System.out.println(); // Add a new line after each test case
            list_of_numbers_to_add.clear();
        }
    }
}
