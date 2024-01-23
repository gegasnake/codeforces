import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Boy_Or_Girl {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        Set<Character> treeSet = new TreeSet<>();
        for(byte i = 0; i < word.length(); i++){
            treeSet.add(word.charAt(i));
        }
        if (treeSet.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
