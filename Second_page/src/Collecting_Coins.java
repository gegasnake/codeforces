import java.util.Arrays;
import java.util.Scanner;

public class Collecting_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int[] array = new int[3];
            array[0] = a;
            array[1] = b;
            array[2] = c;
            Arrays.sort(array);
            int n = scanner.nextInt();
            int until_max1 = array[2] - array[0];
            int until_max2 = array[2] - array[1];
            if (n - until_max1 - until_max2 >= 0 && (n - until_max1 - until_max2) % 3 == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}
