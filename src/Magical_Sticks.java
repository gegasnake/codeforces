import java.util.Scanner;
public class Magical_Sticks {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            int number = scanner.nextInt();
            if (number <= 2){
                System.out.println(1);
            }else{
                if (number % 2 == 1){
                    System.out.println(number / 2 + 1);
                }else{
                    System.out.println(number / 2);
                }

            }

        }
    }
}
