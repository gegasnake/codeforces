import java.util.Arrays;
import java.util.Scanner;
public class Replacing_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte n = scanner.nextByte();
            byte d = scanner.nextByte();
            int[] array = new int[n];
            for (byte x = 0; x < n; x++){
                array[x] = scanner.nextByte();
            }
            Arrays.sort(array);
            if (d < array[0] + array[1] && array[n - 1] > d){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
        }
    }
}
