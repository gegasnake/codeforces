import java.util.Scanner;
public class Mahmoud_And_Ehab_And_The_Even_Odd_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("Mahmoud");
        }else{
            System.out.println("Ehab");
        }
    }
}
