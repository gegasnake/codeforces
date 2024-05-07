import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ICPC_Balloons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        for (byte i = 0; i < test_cases; i ++){
            byte n = scanner.nextByte();
            String s = scanner.next();
            Set<String> set = new HashSet<>();
            byte count = 0;
            for (byte j = 0; j < n; j++){
                if (!set.contains(String.valueOf(s.charAt(j)))){
                    set.add(String.valueOf(s.charAt(j)));
                    count += 2;
                }else{
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}
