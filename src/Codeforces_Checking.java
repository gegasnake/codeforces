import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Codeforces_Checking {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        Set<Character> set = new HashSet<>();
        set.add('c');
        set.add('o');
        set.add('d');
        set.add('e');
        set.add('f');
        set.add('r');
        set.add('s');
        for (byte i = 0; i < test_cases; i++){
            Character letter = scanner.next().charAt(0);
            if(set.contains(letter)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
