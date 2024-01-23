import java.util.Scanner;
public class Lucky {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            String ticket = scanner.next();
            int first_digit= Integer.parseInt(String.valueOf(ticket.charAt(0)));
            int second_digit = Integer.parseInt(String.valueOf(ticket.charAt(1)));
            int third_digit = Integer.parseInt(String.valueOf(ticket.charAt(2)));
            int fourth_digit = Integer.parseInt(String.valueOf(ticket.charAt(3)));
            int fifth_digit = Integer.parseInt(String.valueOf(ticket.charAt(4)));
            int sixth_digit = Integer.parseInt(String.valueOf(ticket.charAt(5)));
            if (first_digit + second_digit + third_digit == fourth_digit + fifth_digit + sixth_digit){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}
