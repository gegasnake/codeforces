import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        for (byte i = 0; i < test_cases; i++){
            List<String> letter_list = new ArrayList<>();
            letter_list.add("a");
            letter_list.add("b");
            letter_list.add("c");
            letter_list.add("d");
            letter_list.add("e");
            letter_list.add("f");
            letter_list.add("g");
            letter_list.add("h");
            List<String> number_list = new ArrayList<>();
            number_list.add("1");
            number_list.add("2");
            number_list.add("3");
            number_list.add("4");
            number_list.add("5");
            number_list.add("6");
            number_list.add("7");
            number_list.add("8");
            String s = scanner.next();
            letter_list.remove(s.substring(0, 1));
            number_list.remove(s.substring(1));
            for (byte x = 0; x < 7; x++){
                System.out.println(letter_list.get(x) + s.substring(1));
            }

            for (byte x = 0; x < 7; x++){
                System.out.println(s.charAt(0) + number_list.get(x));
            }


        }
    }
}
