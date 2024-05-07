import java.util.Scanner;
public class Most_Unstable_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            int n = scanner.nextInt(), m = scanner.nextInt();
            if (n == 1){
                System.out.println(0);
            }else if (n == 2){
                System.out.println(m);
            }else{
                System.out.println(m * 2);
            }
        }
    }
}
