import java.util.Scanner;
public class Cipher_Shifer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte length = scanner.nextByte();
            String s = scanner.next();
            String result = "";
            char c = s.charAt(0);
            byte x = 1;
            while (x < length){
                if (c != s.charAt(x)){
                    x++;
                    continue;
                }else{
                    result += c;
                    if (x  < length - 1){
                        c = s.charAt(x + 1);
                    }
                    x += 2;
                }
            }

            System.out.println(result);
        }
    }
}
