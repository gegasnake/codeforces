import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Blank_Space {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte length = scanner.nextByte();
            List<Byte> list = new ArrayList<>();
            byte longest_blank = 0;
            for (byte j = 0; j < length; j++){
                byte a = scanner.nextByte();
                if (a == 0){
                    longest_blank++;
                    list.add(longest_blank);
                }else{
                    longest_blank = 0;
                }
            }
            if (list.stream().max(Integer::compare).isEmpty()){
                System.out.println(0);
            }else{
                System.out.println(list.stream().max(Integer::compare).get());
            }

        }
    }
}
