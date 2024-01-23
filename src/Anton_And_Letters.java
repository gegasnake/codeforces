import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Anton_And_Letters {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String set_of_letters = scanner.nextLine();
        if (Objects.equals(set_of_letters, "{}")) {
            System.out.println(0);
        }else{
            Set<Character> letters = new TreeSet<>();
            for (short i = 1; i < set_of_letters.length(); i+=3){
                letters.add(set_of_letters.charAt(i));
            }

            System.out.println(letters.size());
        }


    }
}
