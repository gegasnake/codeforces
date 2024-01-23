import java.util.Scanner;
public class Petya_and_Strings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine().toLowerCase();
        String word2 = scanner.nextLine().toLowerCase();
        if (word1.compareTo(word2) < 0){
            System.out.println(-1);
        }else if(word1.compareTo(word2) > 0){
            System.out.println(1);
        }else{
            System.out.println(word1.compareTo(word2));
        }


    }
}
