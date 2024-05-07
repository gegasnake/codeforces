import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CopyCopyCopyCopyCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test_cases = scanner.nextInt();
        for (int i = 0; i < test_cases; i++){
            int n = scanner.nextInt();
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < n; j++){
                set.add(scanner.nextInt());
            }

            System.out.println(set.size());
        }
    }
}
