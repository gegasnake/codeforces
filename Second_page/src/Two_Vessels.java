import java.util.Scanner;
public class Two_Vessels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte a = scanner.nextByte(), b = scanner.nextByte(), c = scanner.nextByte();
            byte count = 0;
            if (a > b){
                while (a > b){
                    if (a - b >= c){
                        a -= c;
                        b += c;
                        count++;
                    }else{
                        count++;
                        break;
                    }

                }
            }else{
                while (a < b){
                    if (b - a >= c){
                        b -= c;
                        a += c;
                        count++;
                    }else{
                        count++;
                        break;
                    }

                }
            }
            System.out.println(count);
        }
    }
}
