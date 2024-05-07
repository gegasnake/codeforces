import java.util.Scanner;
public class Phoenix_And_Balance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        for (byte i = 0; i < test_cases; i++){
            byte n = scanner.nextByte();
            if (n == 2){
                System.out.println(2);
            }else{
                int x = 2;
                for (byte j = 2; j < n; j += 2){
                    x = x * 2 + 2;
                }
                System.out.println(x);
            }
        }
    }
}
