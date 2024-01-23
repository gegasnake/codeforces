import java.util.Scanner;
import java.util.Arrays;
public class Helpful_Maths {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringBuilder sum = new StringBuilder(scanner.nextLine());
        if (sum.length() == 1){
            System.out.println(sum);
        }else{
            byte[] array_of_numbers = new byte[sum.length() / 2 + 1];
            byte x = 0;
            for(byte i = 0; i < array_of_numbers.length; i++){
                array_of_numbers[i] = (byte) Integer.parseInt(String.valueOf(sum.charAt(x)));
                x += 2;
            }
            Arrays.sort(array_of_numbers);
            sum = new StringBuilder();
            for (byte i = 0; i < array_of_numbers.length; i++){
                if (i != 0){
                    sum.append("+");
                }
                sum.append(array_of_numbers[i]);

            }

            System.out.println(sum);
        }

    }
}
