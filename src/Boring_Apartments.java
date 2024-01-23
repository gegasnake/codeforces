import java.util.Scanner;
public class Boring_Apartments {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        for (byte i = 0; i < test_cases; i++){
            short apartment = scanner.nextShort();
            short number_of_pushes = (short) (10 * (apartment % 10 - 1));
            byte count = 0;
            while(apartment > 0){
                apartment /= 10;
                count++;
            }
            for (byte x = 1; x <= count; x++){
                number_of_pushes += x;
            }
            System.out.println(number_of_pushes);
        }
    }
}
