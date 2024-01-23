import java.util.Scanner;
public class Translation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        boolean yes = true;
        if (word1.length() != word2.length()){
            System.out.println("NO");
            yes = false;
        }else{
            for (byte i = 0; i < word1.length(); i++){
                if (word1.charAt(i) == word2.charAt(word1.length() - i - 1)){
                    continue;
                }else{
                    yes = false;
                    System.out.println("NO");
                    break;

                }

            }
            if(yes){
                System.out.println("YES");
            }
        }


    }
}
