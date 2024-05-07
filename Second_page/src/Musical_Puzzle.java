import java.util.HashSet;
import java.util.Scanner;

public class Musical_Puzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short t = scanner.nextShort();
        for (short i = 0; i < t; i++) {
            byte n = scanner.nextByte();
            String s = scanner.next();
            HashSet<String> hashSet = new HashSet<>();
            for(int x=0;x+1<n;x++){
                hashSet.add(s.charAt(x)+""+s.charAt(x+1));
            }
            System.out.println(hashSet.size());
        }
    }
}
