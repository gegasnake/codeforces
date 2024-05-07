import java.util.Scanner;
public class Round_Down_The_Price {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            int m = scanner.nextInt();
            if (m < 10){
                System.out.println(m - 1);
            }else{
                int k = m;
                int count = 1;
                while (k >= 10){
                    k /= 10;
                    count *= 10;
                }
                if (m == count){
                    System.out.println(0);
                }else{
                    System.out.println(m - count);
                }

            }

        }
    }
}
