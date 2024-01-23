import java.util.Arrays;
import java.util.Scanner;
public class Honest_Coach {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte number_of_athletes = scanner.nextByte();
            short[] array = new short[number_of_athletes];
            for (byte x = 0; x < number_of_athletes; x++){
                short strength = scanner.nextShort();
                array[x] = strength;
            }
            Arrays.sort(array);
            int minDifference = Integer.MAX_VALUE;
            for (int j = 1; j < number_of_athletes; j++) {
                minDifference = Math.min(minDifference, array[j] - array[j - 1]);
            }
            System.out.println(minDifference);

        }
    }
}
