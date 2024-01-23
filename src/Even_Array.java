import java.util.Scanner;
public class Even_Array {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte length = scanner.nextByte();
            byte odd = 0;
            byte even = 0;
            byte change = 0;
            for (byte x = 0; x < length; x++){
                short number = scanner.nextShort();
                if (number % 2 != x % 2){
                    change++;
                }
                if (number % 2 == 1){
                    odd++;
                }else{
                    even++;
                }
            }
            if ((length % 2 == 1 && change == length) || (odd != length / 2  && even != length / 2 + 1)){
                System.out.println(-1);
            }else if((length % 2 == 0) && (odd != length / 2 && even != length / 2)){
                System.out.println(-1);
            }else{
                if (change < 2){
                    System.out.println(change);
                }else{
                    System.out.println(change / 2);
                }
            }

        }
    }
}
