import java.util.Scanner;
public class Way_Too_Long_Words {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte number_of_words = scanner.nextByte();
        scanner.nextLine();
        for(byte i = 0; i < number_of_words; i++){
            String word = scanner.nextLine();
            if (word.length() > 10){
                System.out.println("" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1));
            }else{
                System.out.println(word);
            }

        }

    }
}
