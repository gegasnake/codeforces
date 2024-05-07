import java.util.Scanner;
public class LCM_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++) {
            int l = scanner.nextInt(), r = scanner.nextInt();
            if (r % l == 0) {
                System.out.println(l + " " + r);
            }else if(r % l != 0 && r >= l * 2){
                System.out.println(l + " " + l * 2);
            }else{
                System.out.println(-1 + " " + -1);
            }
        }
    }
}
