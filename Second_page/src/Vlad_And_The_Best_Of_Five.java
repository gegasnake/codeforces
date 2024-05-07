import java.util.Arrays;
import java.util.Scanner;
public class Vlad_And_The_Best_Of_Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte t = scanner.nextByte();
        for (byte i = 0; i < t; i++){
            String s = scanner.next();
            byte A = 0;
            byte B = 0;
            for (byte k = 0; k < 5; k++){
                if (s.charAt(k) == 'A'){
                    A++;
                }else{
                    B++;
                }
            }
            if (A > B){
                System.out.println("A");
            }else{
                System.out.println("B");
            }
        }
    }
}
