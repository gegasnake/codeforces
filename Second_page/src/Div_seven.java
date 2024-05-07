import java.util.Scanner;

public class Div_seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextShort();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextShort();
            if (n % 7 == 0) {
                System.out.println(n);
            }else{
                int x = n % 10;
                int other_part = n - x;
                while(other_part % 7 != 0){
                    other_part++;
                }
                System.out.println(other_part);

            }
        }
    }
}
