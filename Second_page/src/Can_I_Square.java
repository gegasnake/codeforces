import java.util.Scanner;
public class Can_I_Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            int n = scanner.nextInt();
            long count = 0;
            for (int x = 0; x < n; x++){
                count += scanner.nextInt();
            }
            long squareRoot = (long) Math.sqrt(count);
            if (squareRoot * squareRoot == count){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
