import java.util.Arrays;
import java.util.Scanner;
public class Amusing_Joke {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String guest = scanner.next();
        String host = scanner.next();
        String letters = scanner.next();
        String guest_and_host = guest + host;
        char[] letter_chars = letters.toCharArray();
        char[] guest_and_host_chars = guest_and_host.toCharArray();
        Arrays.sort(letter_chars);
        Arrays.sort(guest_and_host_chars);
        String new_letters = new String(letter_chars);
        String new_guest_and_host = new String(guest_and_host_chars);
        if (new_letters.equals(new_guest_and_host)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }
}
