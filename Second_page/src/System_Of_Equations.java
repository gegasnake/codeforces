import java.util.Scanner;
public class System_Of_Equations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int count = 0;
        for (int i = 0; i <= 1000; i++){
            for (int x = 0; x <= 1000; x++){
                if (x * x + i == m && i * i + x == n){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
