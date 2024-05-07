import java.util.Scanner;
public class Not_Quite_Latin_Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        for (byte i = 0; i < test_cases; i++){
            for (byte x = 0; x < 3; x++){
                String s = scanner.next();
                if (s.contains("?") && !s.contains("A")){
                    System.out.println("A");
                }else if (s.contains("?") && !s.contains("B")){
                    System.out.println("B");
                }else if(s.contains("?") && !s.contains("C")){
                    System.out.println("C");
                }
            }
        }
    }
}
