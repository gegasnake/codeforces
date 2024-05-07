import java.util.Scanner;
public class Arithmetic_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            int length = scanner.nextByte();
            int sum = 0;
            for (byte j = 0; j < length; j++){
                sum += scanner.nextShort();
            }
            if (sum / length == 1 && sum % length == 0){
                System.out.println(0);
            }else{
                if (sum - length < 1){
                    System.out.println(1);
                }else{
                    System.out.println(sum - length);
                }
            }





        }
    }
}
