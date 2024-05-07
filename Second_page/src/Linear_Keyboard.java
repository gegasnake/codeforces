import java.util.Scanner;
public class Linear_Keyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            String current = scanner.next();
            String word = scanner.next();
            int count = 0;
            char current_char = word.charAt(0);
            for (byte x = 0; x < word.length(); x++){
                count += Math.abs(current.indexOf(word.charAt(x)) - current.indexOf(current_char));
                current_char = word.charAt(x);
            }
            System.out.println(count);
        }
    }
}
