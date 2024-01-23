import java.util.Scanner;
public class Maximum_GCD {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        for (byte i = 0; i < test_cases; i++){
            int number = scanner.nextInt();
            if (number == 1){
                System.out.println(1);
            }else{
                System.out.println(number / 2);
            }

        }
    }
}
