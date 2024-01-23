import java.util.Scanner;
public class To_My_Critics {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte a = scanner.nextByte();
            byte b = scanner.nextByte();
            byte c = scanner.nextByte();


            if (a + b >= 10 || a + c >= 10 || b + c >= 10){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}
