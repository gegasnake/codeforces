import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        for (byte i = 0; i < test_cases; i++){
            HashMap<Short, Short> map = new HashMap<>();
            List<Short> list = new ArrayList<>();
            short z = 0;
            for (byte c = 0; c < 4; c++){
                short x = scanner.nextShort();
                short y = scanner.nextShort();
                if (!list.contains(x)){
                    list.add(x);
                }
                if (!map.containsKey(x)){
                    map.put(x, y);
                }else{
                    map.replace(x, (short) (Math.abs(map.get(x) - y)));
                }
                z = x;
            }

            System.out.println(map.get(z) * Math.abs(list.get(0) - list.get(1)));
        }
    }
}
