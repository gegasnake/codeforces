import java.util.Scanner;
public class Yet_Another_Two_Integers_Problem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if ((Math.max(a, b) - Math.min(a, b)) % 10 != 0){
                System.out.println((Math.max(a, b)- Math.min(a, b)) / 10 + 1);
            }else{
                System.out.println((Math.max(a, b) - Math.min(a, b)) / 10);
            }
        }
    }
}
