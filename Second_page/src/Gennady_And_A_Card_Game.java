import java.util.HashSet;
import java.util.Scanner;
public class Gennady_And_A_Card_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        boolean bool = false;
        for (byte i = 0; i < 5; i++){
            String card = scanner.next();
            set1.add(card.charAt(0));
            set2.add(card.charAt(1));
            if (set1.contains(s.charAt(0)) || set2.contains(s.charAt(1))){
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
