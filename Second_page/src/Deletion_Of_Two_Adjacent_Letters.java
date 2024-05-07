import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Deletion_Of_Two_Adjacent_Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            String s = scanner.next();
            String c = scanner.next();
            List<Byte> list = new ArrayList<>();
            for (byte x = 0; x < s.length(); x++){
                if (s.charAt(x) == c.charAt(0)){
                    list.add(x);
                }
            }
            boolean bool = false;
            for (byte x = 0; x < list.size(); x++){
                if (list.get(x) % 2 == 0 && (s.length() - list.get(x)) % 2 == 1){
                    bool = true;
                    break;
                }
            }

            if (bool){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
