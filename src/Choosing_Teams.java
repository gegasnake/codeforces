import java.util.Scanner;
public class Choosing_Teams {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort();
        byte k = scanner.nextByte();
        short result = 0;
        for (short i = 0; i < n; i++){
            byte y = scanner.nextByte();
            if (y + k <= 5){
                result++;
            }
        }

        System.out.println(result / 3);
    }
}
