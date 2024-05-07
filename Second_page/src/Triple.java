import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Triple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            int length = scanner.nextInt();
            Map<Integer, Byte> map = new HashMap<>();
            boolean bool = true;
            int x = 0;
            for (int j = 0; j < length; j++){
                int a = scanner.nextInt();
                if (!map.containsKey(a)){
                    map.put(a, (byte) 1);
                }else{
                    map.replace(a, (byte) (map.get(a) + 1));
                    if (map.get(a) == 3){
                        bool = false;
                        x = a;

                    }
                }
            }
            if (bool){
                System.out.println(-1);
            }else{
                System.out.println(x);
            }

        }
    }
}
