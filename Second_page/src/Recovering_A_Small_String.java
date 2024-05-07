import java.util.HashMap;
import java.util.Scanner;
public class Recovering_A_Small_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        HashMap<Integer, Character> letterValues = new HashMap<>();

        // Populate the HashMap with English letters and their corresponding values
        char currentLetter = 'a';
        for (int value = 1; value <= 26; value++) {
            letterValues.put(value, currentLetter);
            currentLetter++;
        }
        for (byte i = 0; i < test_cases; i++){
            String s = "";
            byte encoded_word = scanner.nextByte();
            byte number_of_zs = (byte) (encoded_word / 26);
            if (encoded_word == 27){
                System.out.println("aay");
            }else if (encoded_word == 26){
                System.out.println("aax");
            }else if (encoded_word == 52) {
                System.out.println("ayz");
            } else{
                if (number_of_zs == 3){
                    s = "zzz";
                }else if (number_of_zs == 2){
                    s += letterValues.get((int) encoded_word - 52) + "zz";
                }else if(number_of_zs == 1){
                    s += "a" + letterValues.get((int) encoded_word - 27) + "z";
                }else{
                    s += "aa" + letterValues.get((int) encoded_word - 2);
                }
                System.out.println(s);
            }


        }

    }
}
