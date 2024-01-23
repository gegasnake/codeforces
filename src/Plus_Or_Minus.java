import java.util.Scanner;
public class Plus_Or_Minus {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte a = scanner.nextByte();
            byte b = scanner.nextByte();
            byte c = scanner.nextByte();
            if (a + b == c){
                System.out.println('+');
            }else if(a - b == c){
                System.out.println('-');
            }
        }
    }
}
