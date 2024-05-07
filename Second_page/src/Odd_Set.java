import java.util.Scanner;
public class Odd_Set {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        for (byte i = 0; i < test_cases; i++){
            short odd_count = 0;
            short n = scanner.nextByte();
            for (short j = 0; j < n * 2; j++){
                short a = scanner.nextByte();
                if (a % 2 == 1){
                    odd_count++;
                }
            }
            if (odd_count == n * 2 - odd_count){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
