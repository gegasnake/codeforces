import java.util.Arrays;
import java.util.Scanner;
public class Array_Coloring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte length = scanner.nextByte();
            int[] array = new int[length];
            for (byte j = 0; j < length; j++){
                array[j] = scanner.nextByte();
            }
            int number_of_odds = (int) Arrays.stream(array).filter(x -> x % 2 == 1).count();
            if (number_of_odds % 2 == 1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
