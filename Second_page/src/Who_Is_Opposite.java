import java.util.Scanner;
public class Who_Is_Opposite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
            int max = 2 * Math.abs(a - b);
            if (a > max || b > max || c > max){
                System.out.println(-1);
            }else {
                int d = max / 2 + c;
                while (d > max){
                    d -= max;
                }
                System.out.println(d);
            }

        }
    }
}
