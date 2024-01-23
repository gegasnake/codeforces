import java.util.Scanner;
public class Square_String {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        for (byte i = 0; i < test_cases; i++){
            String word = scanner.next();
            if (word.substring(0, word.length() / 2).equals(word.substring(word.length() / 2))){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
