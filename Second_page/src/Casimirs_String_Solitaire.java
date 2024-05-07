import java.util.Arrays;
import java.util.Scanner;
public class Casimirs_String_Solitaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            char[] s = scanner.next().toCharArray();
            byte count = 0;
            for (byte x = 0; x < s.length; x++){
                if (s[x] == 'B') {
                    count++;
                }
            }

            if (s.length % 2 == 1){
                System.out.println("NO");
            }else{
                if (s.length / 2 == count){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }

        }
    }
}
