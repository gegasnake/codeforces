import java.util.HashMap;
import java.util.Scanner;
public class Presents {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte quantity_of_friends = scanner.nextByte();
        HashMap<Byte, Byte> gifts = new HashMap();
        for (byte i = 1; i <= quantity_of_friends; i++){
            byte gifted_person = scanner.nextByte();
            gifts.put(gifted_person, i);
        }

        for (byte i = 1; i <= quantity_of_friends; i++){
            System.out.print(gifts.get(i));
            if (i != quantity_of_friends){
                System.out.print(" ");
            }
        }
    }
}
