import java.util.Scanner;
import java.util.TreeSet;

public class In_Search_Of_An_Easy_Problem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte number_of_people = scanner.nextByte();
        byte sum = 0;
        for (byte i = 0; i < number_of_people; i++){
            byte opinion = scanner.nextByte();
            sum += opinion;
        }
        if (sum == 0){
            System.out.println("EASY");
        }else{
            System.out.println("HARD");
        }



    }
}
