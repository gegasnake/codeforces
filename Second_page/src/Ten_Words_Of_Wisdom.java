import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
public class Ten_Words_Of_Wisdom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        for (byte i = 0; i < test_cases; i++){
            byte n = scanner.nextByte();
            List<Byte> list_a = new ArrayList<>();
            List<Byte> list_b = new ArrayList<>();
            for (byte j = 0; j < n; j++){
                byte a = scanner.nextByte(), b = scanner.nextByte();
                list_a.add(a);
                list_b.add(b);
            }
            int max = 0;
            int index = 0;

            for (int j = 0; j < n; j++) {
                if (list_a.get(j) <= 10 && list_b.get(j) > max) {
                    max = list_b.get(j);
                    index = j;
                }
            }
            System.out.println(index + 1);

        }
    }
}
