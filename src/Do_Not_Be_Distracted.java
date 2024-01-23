import java.util.HashSet;
import java.util.Scanner;

public class Do_Not_Be_Distracted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();

        for (short i = 0; i < test_cases; i++) {
            byte days = scanner.nextByte();
            String tasks = scanner.next();

            HashSet<Character> set = new HashSet<>();
            boolean good = true;

            for (byte x = 0; x < days; x++) {
                char task = tasks.charAt(x);

                // Check if the task is repeated on the same day or on a different day
                if (set.contains(task)) {
                    good = false;
                    break;
                }

                // Skip tasks that are repeated on the next day
                while (x < days - 1 && task == tasks.charAt(x + 1)) {
                    x++;
                }

                set.add(task);
            }

            if (good) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
