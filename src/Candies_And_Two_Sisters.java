import java.util.Scanner;
public class Candies_And_Two_Sisters {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short number_of_test_cases = scanner.nextShort();
        for (short i = 0; i < number_of_test_cases; i++){
            int number_of_candies = scanner.nextInt();
            if (number_of_candies % 2 == 0){
                System.out.println(number_of_candies / 2 - 1);
            }else{
                System.out.println(number_of_candies / 2);
            }
        }
    }
}
