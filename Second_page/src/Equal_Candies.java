import java.util.Arrays;
import java.util.Scanner;
public class Equal_Candies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte n = scanner.nextByte();
            int[] array = new int[n];
            for (byte j = 0; j < n; j++){
                int a = scanner.nextInt();
                array[j] = a;
            }
            Arrays.sort(array);
            System.out.println(Arrays.stream(array).sum() - array[0] * n);
        }
    }
}
