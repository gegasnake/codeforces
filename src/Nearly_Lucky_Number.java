import java.util.Scanner;
public class Nearly_Lucky_Number {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        byte number_of_lucky_numbers = 0;
        while (number > 0){
            if (number % 10 == 7 || number % 10 == 4){
                number_of_lucky_numbers++;
            }
            number /= 10;
        }
        if(number_of_lucky_numbers == 4 || number_of_lucky_numbers == 7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
