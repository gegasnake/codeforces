import java.util.Scanner;

public class OneD_Eraser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt(), k = s.nextInt(), total = 0;
            String str = s.next();
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == 'B') {
                    total++;
                    i += k - 1;
                }
            }
            System.out.println(total);
        }
    }
}
