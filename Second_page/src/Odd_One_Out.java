import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Odd_One_Out {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte a = scanner.nextByte(), b = scanner.nextByte(), c = scanner.nextByte();
            Map<Byte, Byte> map = new HashMap<>();
            map.put(a, (byte) 1);
            if (map.containsKey(b)){
                map.replace(a, (byte) 2);
            }else{
                map.put(b, (byte) 1);
                if (map.containsKey(c)){
                    map.replace(c, (byte) 2);
                }
            }
            if (map.get(a) == 1){
                System.out.println(a);
            }else if(map.get(b) == 1){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
    }
}
