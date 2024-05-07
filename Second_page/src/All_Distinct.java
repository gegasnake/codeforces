import java.util.*;

public class All_Distinct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte length = scanner.nextByte();
            List<Short> list = new ArrayList<>();
            Map<Short, Integer> map = new HashMap<>();
            for (byte x = 0; x < length; x++){
                short a = scanner.nextShort();
                if (map.containsKey(a)){
                    map.replace(a, map.get(a), map.get(a) + 1);
                }else{
                    map.put(a, 1);
                    list.add(a);
                }
            }
            int sum = 0;
            for (byte x = 0; x < list.size(); x++){
                sum += map.get(list.get(x)) - 1;
            }
            if (sum % 2 == 1){
                sum += 1;
            }
            System.out.println(length - sum);
        }
    }
}
