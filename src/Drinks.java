import java.util.Scanner;
public class Drinks {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte drinks = scanner.nextByte();
        double velocity = 0;
        byte x = 0;
        for (byte i = 1; i <= drinks; i++){
            byte percent = scanner.nextByte();
            velocity += percent;
            x = i;
        }
        System.out.println(velocity / x);

    }
}
