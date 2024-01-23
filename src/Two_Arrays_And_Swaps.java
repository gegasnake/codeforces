import java.util.Arrays;
import java.util.Scanner;
public class Two_Arrays_And_Swaps {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte n = scanner.nextByte();
            byte k = scanner.nextByte();
            byte[] array_a = new byte[n];
            byte[] array_b = new byte[n];
            for (byte x = 0; x < n; x++){
                byte a = scanner.nextByte();
                array_a[x] = a;
            }
            for(byte x = 0; x < n; x++){
                byte b = scanner.nextByte();
                array_b[x] = b;
            }
            Arrays.sort(array_a);
            Arrays.sort(array_b);
            byte index = 1;
            for (byte x = 0; x < k; x++){
                if (array_a[index - 1] <= array_b[array_b.length - index])
                    array_a[index - 1] = array_b[array_b.length - index];
                index++;
            }
            short count = 0;
            for (byte x = 0; x < n; x++){
                count += array_a[x];
            }
            System.out.println(count);
        }
    }
}
