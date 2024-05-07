import java.util.Scanner;
public class Add_Odd_Or_Subtract_Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            int a = scanner.nextInt(), b = scanner.nextInt();
            int difference = Math.abs(b - a);
            if (difference == 0){
                System.out.println(0);
            }else{
                if (difference % 2 == 0){
                    if (a > b){
                        System.out.println(1);
                    }else{
                        System.out.println(2);
                    }
                }else{
                    if (a > b){
                        System.out.println(2);
                    }else{
                        System.out.println(1);
                    }
                }
            }
        }
    }
}
