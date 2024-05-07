import java.util.Scanner;

public class Short_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte t = scanner.nextByte();
        for (byte i = 0; i < t; i++){
            String input = scanner.next();
            if (input.charAt(0) == 'a' || input.charAt(1) == 'b' || input.charAt(2) == 'c'){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}