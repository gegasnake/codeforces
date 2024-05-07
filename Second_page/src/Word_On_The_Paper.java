import java.util.Scanner;
public class Word_On_The_Paper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            String x = "";
            for (byte j = 0; j < 8; j++){
                String n = scanner.next();
                for (byte k = 0; k < 8; k++){
                    if (n.charAt(k) != '.'){
                        x += n.charAt(k);
                    }
                }
            }
            System.out.println(x);


        }
    }
}
