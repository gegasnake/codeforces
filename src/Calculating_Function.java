import java.util.Scanner;
public class Calculating_Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        if (number % 2 == 1){
            System.out.println((number / 2 + 1) * (-1));
        }else{
            System.out.println(number / 2);
        }
    }
}
