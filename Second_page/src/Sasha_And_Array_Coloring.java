import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Sasha_And_Array_Coloring {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         short test_cases = scanner.nextShort();
         for (short i = 0; i < test_cases; i++){
             byte n = scanner.nextByte();
             int[] array = new int[n];
             for (byte x = 0; x < n; x++){
                 array[x] = scanner.nextByte();
             }
             Arrays.sort(array);
             int count = 0;
             for (byte x = 0; x < n / 2; x++){
                 count += array[n - x - 1] - array[x];
             }
             System.out.println(count);
         }
    }
}
