import java.util.Scanner;
public class Colorful_Stones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String instructions = scanner.next();
        byte squirrel_on_stone_index = 0;
        for (byte x = 0; x < instructions.length(); x++){
            if (s.charAt(squirrel_on_stone_index) == instructions.charAt(x)){
                squirrel_on_stone_index++;
            }
        }

        System.out.println(++squirrel_on_stone_index);
    }
}
