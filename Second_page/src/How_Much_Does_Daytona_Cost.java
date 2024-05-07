import java.util.HashMap;
import java.util.Scanner;
public class How_Much_Does_Daytona_Cost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            short n = scanner.nextShort();
            short k = scanner.nextShort();
            HashMap<Short, Short> map = new HashMap<>();
            for (short j = 0; j < n; j++){
                short a = scanner.nextShort();
                if (!map.containsKey(a)){
                    map.put(a, (short) 1);
                }else{
                    map.replace(a, (short) (map.get(a) + 1));
                }
            }

            if (!map.containsKey(k)){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
