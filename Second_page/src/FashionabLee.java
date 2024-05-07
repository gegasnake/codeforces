import java.util.Scanner;
public class FashionabLee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            int sides = scanner.nextInt();
            if (sides % 4 == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
