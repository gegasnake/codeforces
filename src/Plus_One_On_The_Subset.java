import java.util.Arrays;
import java.util.Scanner;
public class Plus_One_On_The_Subset {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte array_length = scanner.nextByte();
            int[] array = new int[array_length];
            for (byte x = 0; x < array_length; x++){
                int a = scanner.nextInt();
                array[x] = a;
            }

            array = Arrays.stream(array).sorted().toArray();
            System.out.println(array[array_length - 1] - array[0]);
        }
    }
}
