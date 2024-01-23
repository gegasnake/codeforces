import java.util.Scanner;
public class Word {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        byte lower = 0;
        byte upper = 0;
        for (byte i = 0; i < word.length(); i++){
            if (word.charAt(i) >= 65 && word.charAt(i) <= 90){
                upper++;
            }else {
                lower++;
            }
        }
        if (lower >= upper){
            System.out.println(word.toLowerCase());
        }else{
            System.out.println(word.toUpperCase());
        }
    }
}
