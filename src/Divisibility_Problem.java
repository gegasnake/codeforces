import java.util.Scanner;
public class Divisibility_Problem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short lines = scanner.nextShort();
        for (short i = 0; i < lines; i++){
            int first_number = scanner.nextInt();
            int second_number = scanner.nextInt();
            if (first_number % second_number == 0){
                System.out.println(0);
            }else{
                int division = first_number % second_number;
                System.out.println(second_number - division);
            }
        }
    }
}
