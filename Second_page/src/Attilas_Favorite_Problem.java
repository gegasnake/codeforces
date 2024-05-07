import java.util.Arrays;
import java.util.Scanner;
public class Attilas_Favorite_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte length = scanner.nextByte();
            char[] s = scanner.next().toCharArray();
            Arrays.sort(s);
            System.out.println(s[length - 1] - 'a' + 1);
        }
    }
}
