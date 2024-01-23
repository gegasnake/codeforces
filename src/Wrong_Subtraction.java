import java.util.Scanner;
public class Wrong_Subtraction {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        byte number_of_subtractions = scanner.nextByte();
        for (byte i = 0; i < number_of_subtractions; i++){
            if(number % 10 == 0){
                number /= 10;
            }else{
                number--;
            }
        }
        System.out.println(number);
    }
}
