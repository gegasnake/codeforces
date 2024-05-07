import java.util.Scanner;
public class And_Then_There_Were_K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            int n = scanner.nextInt();
            int k = 2;
            if (n == 2){
                System.out.println(1);
            }else if( n == 1){
                System.out.println(0);
            }else{
                while (k <= n){
                    k *= 2;
                }

                System.out.println(k / 2 - 1);
            }
        }
    }
}
