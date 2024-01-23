import java.util.Scanner;
public class Elephant {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int house = scanner.nextInt();
        int steps = 0;

        for (byte i = 1; i < 6; i++){
            steps += house / (6 - i);
            house %= (6 - i);
        }

        System.out.println(steps);






    }
}
