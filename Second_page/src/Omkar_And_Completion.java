import java.util.Scanner;

public class Omkar_And_Completion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short t = scanner.nextShort();
        for (short i = 0; i < t; i++) {
            short n = scanner.nextShort();
            for (short j = 0; j < n; j++) {
                if (j == n - 1){
                    System.out.print(2);
                    System.out.println();
                }else{
                    System.out.print(2 + " ");
                }

            }
        }
    }
}
