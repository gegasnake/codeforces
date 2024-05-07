import java.util.Arrays;
import java.util.Scanner;
public class Array_With_Odd_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            short n = scanner.nextShort();
            int[] array = new int[n];
            for (short j = 0; j < n; j++) {
                array[j] = scanner.nextShort();
            }

            if (n % 2 == 1){
                if (Arrays.stream(array).filter(x -> x % 2 == 1).count() > 0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                if (Arrays.stream(array).filter(x -> x % 2 == 1).count() > 0 && Arrays.stream(array).filter(x -> x % 2 == 1).count() != n){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
