import java.util.HashMap;
import java.util.Scanner;
public class Fair_Division {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte number_of_candies = scanner.nextByte();
            int weight_2 = 0;
            int weight_1 = 0;
            for (byte x = 0; x < number_of_candies; x++){
                byte candy_weight = scanner.nextByte();
                if (candy_weight == 2){
                    weight_2 += 2;
                }else{
                    weight_1++;
                }
            }
            if ((weight_2 / 2) % 2 == 1){
                weight_2 += 2;
                weight_1 -= 2;
                if (weight_1 % 2 == 1 || weight_1 < 0){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }else{
                if (weight_1 % 2 == 1){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }


        }
    }
}
