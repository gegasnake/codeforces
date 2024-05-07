import java.util.Scanner;
public class Two_Elevators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
            int difference_a = a - 1;
            int difference_b = Math.abs(b - c) + c - 1;
            if (difference_a < difference_b){
                System.out.println(1);
            }else if (difference_a > difference_b){
                System.out.println(2);
            }else{
                System.out.println(3);
            }
        }
    }
}
