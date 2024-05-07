import java.util.Scanner;
public class A_Plus_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        for (byte i = 0; i < test_cases; i++){
            String expression = scanner.next();
            System.out.println(expression.charAt(0) + expression.charAt(2) - 96);
        }
    }
}
