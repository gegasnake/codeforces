import java.util.Scanner;
public class Vasya_And_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a == 0){
                System.out.println(1);
            }else{
                System.out.println(a + b * 2 + 1);
            }
        }
    }
}
