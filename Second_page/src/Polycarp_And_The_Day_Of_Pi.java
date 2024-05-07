import java.util.Scanner;
public class Polycarp_And_The_Day_Of_Pi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        String pi = "314159265358979323846264338327";
        for (short i = 0; i < test_cases; i++){
            String s = scanner.next();
            byte count = 0;
            for (byte j = 0; j < s.length(); j++){
                if (s.charAt(j) == pi.charAt(j)){
                    count++;
                }else{
                    break;
                }
            }

            System.out.println(count);
        }

    }
}
