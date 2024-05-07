import java.util.Arrays;
import java.util.Scanner;
public class Good_Kid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte n = scanner.nextByte();
            int[] array = new int[n];
            for (byte j = 0; j < n; j++){
                array[j] = scanner.nextByte();
            }
            int min = Arrays.stream(array).min().getAsInt();
            long count = 1;
            boolean x = true;
            for (int j: array){
                if (j == min && x){
                    count *= j + 1;
                    x = false;
                }else {
                    count *= j;
                }
            }
            System.out.println(count);
        }
    }
}
