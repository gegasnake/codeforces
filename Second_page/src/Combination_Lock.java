import java.util.Scanner;

public class Combination_Lock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort();
        String s1 = scanner.next();
        String s2 = scanner.next();
        int x = 0;
        for (short i = 0; i < n; i++) {
            if (s1.charAt(i) > s2.charAt(i)){
                int l = s1.charAt(i) - s2.charAt(i);
                if (l > 5){
                    x += 10 - l;
                }else{
                    x += l;
                }
            }else{
                int l = s2.charAt(i) - s1.charAt(i);
                if (l > 5){
                    x += 10 - l;
                }else{
                    x += l;
                }
            }
        }
        System.out.println(x);
    }
}
