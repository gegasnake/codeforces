import java.util.Scanner;
public class Print_A_Pedestal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            int n = scanner.nextInt();
            int h3 = (n - 3) / 3;
            int h2 = (n - 3) / 3 + 1;
            int h1 = n - h3 - h2;
            if (h1 - h2 > 2){
                h1--;
                h2++;
            }
            System.out.println(h2 + " " + h1 + " " + h3);
        }
    }
}
