import java.util.Objects;
import java.util.Scanner;
public class Free_Ice_Cream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort();
        long number_of_ice_creams = scanner.nextInt();
        long count = 0;
        for (short i = 0; i < n; i++){
            String operator = scanner.next();
            int x = scanner.nextInt();
            if (Objects.equals(operator, "+")){
                number_of_ice_creams += x;
            }else{
                if (number_of_ice_creams < x){
                    count++;
                }else{
                    number_of_ice_creams -= x;
                }
            }


        }
        System.out.println(number_of_ice_creams + " " + count);
    }
}
