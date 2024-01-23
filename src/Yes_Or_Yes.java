import java.util.Scanner;
public class Yes_Or_Yes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            String yes = scanner.next();
            if (yes.equalsIgnoreCase("yes")){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
