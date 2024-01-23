import java.util.Scanner;
public class Word_Capitalisation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String first_character = String.valueOf(word.charAt(0));
        StringBuilder new_word = new StringBuilder(first_character.toUpperCase());
        for (short i = 1; i < word.length(); i++){
            new_word.append(word.charAt(i));
        }

        System.out.println(new_word);

    }
}
