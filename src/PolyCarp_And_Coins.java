import java.util.Scanner;
public class PolyCarp_And_Coins {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            int number = scanner.nextInt();
            if (number - 3 * (number / 3) == 2){
                System.out.println(number / 3 + " " + (number / 3 + 1));
            }else if (number - 3 * (number / 3) == 1){
                System.out.println(number / 3 + 1 +  " " + (number / 3));
            }else{
                System.out.println(number / 3 + " " + (number / 3));
            }
        }
    }
}
