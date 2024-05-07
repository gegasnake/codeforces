import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Increasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        for (byte i = 0; i < test_cases; i++){
            byte length = scanner.nextByte();
            Set<Integer> set = new HashSet<>();
            for (byte j = 0; j < length; j++){
                int a = scanner.nextInt();
                set.add(a);
            }
            if (set.size() == length){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
