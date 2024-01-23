import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
public class Holiday_Of_Equality {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte number_of_people = scanner.nextByte();
        List<Integer> money_of_people = new ArrayList<>();
        int max_money = 0;
        for (byte i = 0; i < number_of_people; i++){
            int money = scanner.nextInt();
            money_of_people.add(money);
            if (money > max_money){
                max_money = money;
            }
        }
        int money_needed = 0;
        for (byte i = 0; i < number_of_people; i++){
            money_needed += max_money - money_of_people.get(i);
        }
        System.out.println(money_needed);
    }
}
