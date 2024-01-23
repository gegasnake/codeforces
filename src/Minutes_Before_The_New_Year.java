import java.util.Scanner;
public class Minutes_Before_The_New_Year {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte h = scanner.nextByte();
            byte m = scanner.nextByte();
            byte hours_left = (byte) (24 - h - 1);
            byte minutes_left = (byte) (60 - m);
            System.out.println(hours_left * 60 + minutes_left);
        }
    }
}
