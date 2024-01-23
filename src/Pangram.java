import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Pangram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte number_of_letters = scanner.nextByte();
        scanner.nextLine();
        String text = scanner.nextLine();
        HashMap<String, Byte> letters= new HashMap<>();
        letters.put("Aa", (byte) 0);
        letters.put("Bb", (byte) 0);
        letters.put("Cc", (byte) 0);
        letters.put("Dd", (byte) 0);
        letters.put("Ee", (byte) 0);
        letters.put("Ff", (byte) 0);
        letters.put("Gg", (byte) 0);
        letters.put("Hh", (byte) 0);
        letters.put("Ii", (byte) 0);
        letters.put("Jj", (byte) 0);
        letters.put("Kk", (byte) 0);
        letters.put("Ll", (byte) 0);
        letters.put("Mm", (byte) 0);
        letters.put("Nn", (byte) 0);
        letters.put("Oo", (byte) 0);
        letters.put("Pp", (byte) 0);
        letters.put("Qq", (byte) 0);
        letters.put("Rr", (byte) 0);
        letters.put("Ss", (byte) 0);
        letters.put("Tt", (byte) 0);
        letters.put("Uu", (byte) 0);
        letters.put("Vv", (byte) 0);
        letters.put("Ww", (byte) 0);
        letters.put("Xx", (byte) 0);
        letters.put("Yy", (byte) 0);
        letters.put("Zz", (byte) 0);
        if (number_of_letters < 26){
            System.out.println("NO");
        }else{
            for (byte i = 0; i < number_of_letters; i++){
                char character = text.charAt(i);
                String key = "" + Character.toUpperCase(character) + Character.toLowerCase(character);
                letters.replace(key, letters.get(key), (byte) (letters.get(key) + 1));
            }

            if(letters.containsValue((byte) 0)){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }


        }

    }
}
