import java.util.Scanner;
public class Buttons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
            if (c % 2 != 0){
                a++;
            }
            if (a > b){
                System.out.println("First");
            }else{
                System.out.println("Second");
            }
        }
    }
}
