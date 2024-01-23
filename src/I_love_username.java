import java.util.Scanner;
public class I_love_username {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short number_of_contests = scanner.nextShort();
        short min = scanner.nextShort();
        short max = min;
        short records = 0;
        for(short i = 2; i <= number_of_contests; i++){
            short point = scanner.nextShort();
            if (point > max){
                max = point;
                records++;
            }else if(point < min){
                min = point;
                records++;
            }

        }
        System.out.println(records);
    }
}
