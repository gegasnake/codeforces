import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
public class Colourblindness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Byte> x = new HashMap<>();
        x.put('G', (byte) 0);
        x.put('B', (byte) 0);
        x.put('R', (byte) 1);
        byte test_cases = scanner.nextByte();
        for (byte i = 0; i < test_cases; i++){
            boolean l = true;
            byte columns = scanner.nextByte();
            String first_row = scanner.next();
            String second_row = scanner.next();
            for (byte j = 0; j < columns; j++){
                if (!Objects.equals(x.get(first_row.charAt(j)), x.get(second_row.charAt(j)))){
                    l = false;
                    break;
                }
            }
            if (l){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
