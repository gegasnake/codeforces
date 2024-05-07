import java.util.Scanner;
public class Ordinary_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            int number = scanner.nextInt();
            int same_number = number;
            int count = 0;
            int x = 0;
            while(number != 0){
                number /= 10;
                x *= 10;
                x++;
                count++;
            }
            System.out.println(same_number / x + 9 * (count - 1));
        }
    }
}
