import java.util.Arrays;
import java.util.Scanner;
public class Gifts_Fixing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte number_of_gifts = scanner.nextByte();
            int[] candies = new int[number_of_gifts];
            int[] oranges = new int[number_of_gifts];
            for (byte j = 0; j < number_of_gifts; j++){
                candies[j] = scanner.nextInt();
            }
            for (byte j = 0; j < number_of_gifts; j++){
                oranges[j] = scanner.nextInt();
            }

            int min_candies = Arrays.stream(candies).min().getAsInt();
            int min_oranges = Arrays.stream(oranges).min().getAsInt();
            long count = 0;
            for (byte j = 0; j < number_of_gifts; j++){
                int difference_candies = candies[j] - min_candies;
                int difference_oranges = oranges[j] - min_oranges;
                if (difference_candies < difference_oranges){
                    difference_oranges -= difference_candies;
                    count += difference_candies + difference_oranges;
                }else{
                    difference_candies -= difference_oranges;
                    count += difference_oranges + difference_candies;
                }


            }
            System.out.println(count);
        }
    }
}
