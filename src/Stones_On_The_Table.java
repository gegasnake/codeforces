import java.util.Scanner;
import java.util.Stack;
public class Stones_On_The_Table {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte number_of_stones = scanner.nextByte();
        scanner.nextLine();
        String word = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        stack.add(word.charAt(0));
        byte stones_to_grab = 0;
        for (byte i = 1; i < number_of_stones; i++){
            if(stack.lastElement() == word.charAt(i)){
                stones_to_grab++;
            }
            stack.add(word.charAt(i));
        }
        System.out.println(stones_to_grab);






    }
}
