import java.util.Arrays;
import java.util.Scanner;
public class Grab_The_Candies{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte n = scanner.nextByte();
            int[] array = new int[n];
            for (byte j = 0; j < n; j++){
                array[j] = scanner.nextByte();
            }
            int odd_sum = Arrays.stream(array).filter(x -> x % 2 == 1).sum();
            int even_sum = Arrays.stream(array).filter(x -> x % 2 == 0).sum();
            if (even_sum > odd_sum){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}
