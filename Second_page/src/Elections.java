import java.util.Scanner;

public class Elections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test_cases = scanner.nextInt();

        for (int i = 0; i < test_cases; i++) {
            int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
            int max = Math.max(Math.max(a, b), c);

            if (a == b && b == c) {
                System.out.println("1 1 1");
            }else if (a == max && a == b){
                System.out.println("1 1 " + (a - c + 1));
            }else if (a == max && a == c){
                System.out.println("1 " + (a - b +1) + " 1");
            }else if (b == max && b == c){
                System.out.println((b - a + 1) + " 1 1");
            }else if (a == max){
                System.out.println("0 " + (a - b + 1) + " " + (a - c + 1));
            }else if (b == max){
                System.out.println((b - a + 1) + " 0 " + (b - c + 1));
            }else {
                System.out.println((c - a + 1) + " " + (c - b + 1) + " 0");
            }
        }
    }
}
