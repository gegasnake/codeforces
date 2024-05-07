import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Polycarp_And_Sums_Of_Subsequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short t = scanner.nextShort();
        for (short i = 0; i < t; i++) {
            List<Integer> list = new ArrayList<>();
            for (byte j = 0; j < 7; j++) {
                list.add(scanner.nextInt());
            }
            list.sort(Integer::compare);
            for (short j = 1; j < 7; j++) {
                for (short k = (short) (j + 1); k < 7; k++) {
                    if (list.get(j) + list.get(k) == list.get(6) - list.get(0)){
                        System.out.println(list.getFirst() + " " + list.get(j) + " " + list.get(k));
                        break;
                    }
                }
            }
        }
    }
}
