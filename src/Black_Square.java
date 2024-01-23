import java.util.HashMap;
import java.util.Scanner;
public class Black_Square {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short a1 = scanner.nextShort();
        short a2 = scanner.nextShort();
        short a3 = scanner.nextShort();
        short a4 = scanner.nextShort();
        HashMap<Character, Short> map =  new HashMap<>();
        map.put('1', a1);
        map.put('2', a2);
        map.put('3', a3);
        map.put('4', a4);
        int calories = 0;
        String black_square_game = scanner.next();
        for (int i = 0; i < black_square_game.length(); i++){
            calories += map.get(black_square_game.charAt(i));
        }
        System.out.println(calories);
    }
}
