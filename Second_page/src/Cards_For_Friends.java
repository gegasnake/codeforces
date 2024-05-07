import java.util.Scanner;
public class Cards_For_Friends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            short w = scanner.nextShort(), h = scanner.nextShort();
            int number_of_friends = scanner.nextInt();
            int count = 1;
            while(w % 2 == 0){
                count *= 2;
                w /= 2;
            }
            while(h % 2 == 0){
                count *= 2;
                h /= 2;
            }
            if (count >= number_of_friends){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
