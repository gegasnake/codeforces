import java.util.HashSet;
import java.util.Scanner;
public class Spell_Check {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte length = scanner.nextByte();
            String s = scanner.next();
            if (length != 5){
                System.out.println("NO");
            }else{
                HashSet<Character> set = new HashSet<>();
                for (byte x = 0; x < length; x++){
                    set.add(s.charAt(x));
                }
                if (set.contains('T') && set.contains('i') && set.contains('m') && set.contains('u') && set.contains('r')){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
