import java.util.Arrays;
import java.util.Scanner;
public class Following_Directions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte[] coordinates = new byte[]{0, 0};
            byte length = scanner.nextByte();
            String directions = scanner.next();
            boolean x = false;
            for (byte j = 0; j < length; j++){
                if (directions.charAt(j) == 'U'){
                    coordinates[1]++;
                }else if(directions.charAt(j) == 'D'){
                    coordinates[1]--;
                }else if(directions.charAt(j) == 'R'){
                    coordinates[0]++;
                }else{
                    coordinates[0]--;
                }

                if (coordinates[0] == 1 && coordinates[1] == 1){
                    x = true;
                    break;
                }
            }
            if (x){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }
}
