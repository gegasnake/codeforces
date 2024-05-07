import java.util.Scanner;
public class EhAb_AnD_GCd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        for (byte i = 0; i < test_cases; i++){
            int x = scanner.nextInt();
            System.out.println(1 + " " + (x - 1));
        }
    }
}
