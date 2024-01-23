import java.util.Scanner;
public class Required_Remainder {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int test_cases = scanner.nextInt();
        for (int i = 0; i < test_cases; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int n = scanner.nextInt();
            if (x * (n  / x) + y > n){
                System.out.println(x * (n / x - 1) + y);
            }else{
                System.out.println(x * (n / x) + y);
            }
        }
    }
}
