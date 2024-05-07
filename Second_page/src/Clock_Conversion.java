import java.util.Scanner;

public class Clock_Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short t = scanner.nextShort();
        for (short i = 0; i < t; i++) {
            String s = scanner.next();
            if (s.charAt(0) == '0' && s.charAt(1) != '0'){
                System.out.println(s + " AM");
            }else if (s.charAt(0) == '1' && (s.charAt(1) == '1' || s.charAt(1) == '0')){
                System.out.println(s + " AM");
            }else if (s.startsWith("00")) {
                System.out.println("12" + s.substring(2) + " AM");
            }else if (s.startsWith("12")) {
                System.out.println(s + " PM");
            }else{
                int x = Integer.parseInt(s.substring(0, 2));
                if (x - 12 < 10){
                    System.out.println("0" + (x - 12) + s.substring(2) + " PM");
                }else{
                    System.out.println((x - 12) + s.substring(2) + " PM");
                }

            }
        }
    }
}
