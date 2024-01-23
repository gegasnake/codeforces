import java.util.Scanner;
public class Short_Substrings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            String b = scanner.next();
            if (b.length() == 2){
                System.out.println(b);
            }else{
                StringBuilder a = new StringBuilder();
                a.append(b.charAt(0));
                for(byte x = 1; x < b.length() - 1; x += 2){
                    a.append(b.charAt(x));
                }
                a.append(b.charAt(b.length() - 1));
                System.out.println(a);
            }
        }
    }
}
