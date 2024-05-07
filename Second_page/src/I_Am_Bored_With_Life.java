import java.util.Scanner;
public class I_Am_Bored_With_Life {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            x *= i;
        }
        System.out.println(x);
    }
}
