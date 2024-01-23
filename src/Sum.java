import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte a = scanner.nextByte();
            byte b = scanner.nextByte();
            byte c = scanner.nextByte();
            if (a + b == c || b + c == a || a + c == b){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
