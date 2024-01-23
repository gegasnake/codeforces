import java.util.Scanner;
public class Marathon {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte result = 0;
            short a = scanner.nextShort();
            short b = scanner.nextShort();
            short c = scanner.nextShort();
            short d = scanner.nextShort();
            if (a < b){
                result++;
            }
            if(a < c){
                result++;
            }
            if(a < d){
                result++;
            }
            System.out.println(result);
        }
    }
}
