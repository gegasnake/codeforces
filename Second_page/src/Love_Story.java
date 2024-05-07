import java.util.Scanner;
public class Love_Story {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            String codeforces = scanner.next();
            byte count = 0;
            for (byte j = 0; j < 10; j++){
                if (codeforces.charAt(j) != "codeforces".charAt(j)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
