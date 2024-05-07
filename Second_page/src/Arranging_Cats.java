import java.util.Objects;
import java.util.Scanner;
public class Arranging_Cats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (int i = 0; i < test_cases; i++) {
            int n = scanner.nextInt();
            String s1 = scanner.next();
            String s2 = scanner.next();
            int count1 = 0, count2 = 0;
            int count_same = 0;
            if (Objects.equals(s1, s2)){
                System.out.println(0);
            }else {

                for (int j = 0; j < n; j++) {
                    if (s1.charAt(j) == '1') {
                        count1++;
                    }

                    if (s2.charAt(j) == '1') {
                        count2++;
                    }

                    if (s1.charAt(j) == s2.charAt(j) && s1.charAt(j) == '1') {
                        count_same++;
                    }


                }

                if (count1 > count2) {
                    System.out.println(count1 - count_same);
                } else if (count1 < count2) {
                    System.out.println(count2 - count_same);
                } else {
                    System.out.println(count1 - count_same);
                }
            }
        }
    }
}
