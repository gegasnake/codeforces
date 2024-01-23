import java.util.Scanner;
public class Design_Tutorial_Learn_From_Math {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 1){
            System.out.println(9 + " " + (number - 9));
        }else{
            System.out.println(4 + " " + (number - 4));
        }
    }
}
