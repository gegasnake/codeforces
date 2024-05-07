import java.util.Scanner;
public class Prepend_And_Append {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        for (byte i = 0; i < test_cases; i++){
            short length = scanner.nextShort();
            short count = length;
            String s = scanner.next();
            for (short j = 0; j < length; j++){
                if (s.charAt(j) != s.charAt(length - j - 1)){
                    count -= 2;
                }else{
                    break;
                }
                if (count == 0){
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
