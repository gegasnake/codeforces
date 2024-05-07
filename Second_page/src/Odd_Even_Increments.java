import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Odd_Even_Increments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        for (byte i = 0; i < test_cases; i++){
            byte length = scanner.nextByte();
            List<Short> list = new ArrayList<>();
            for (byte x = 0; x < length; x++){
                list.add(scanner.nextShort());
            }
            boolean odds = list.get(1) % 2 == 0;
            boolean evens = list.get(0) % 2 == 0;
            if (odds){
                byte index = 1;
                while (index < length){
                    if (list.get(index) % 2 == 0){
                        index += 2;
                        odds = true;
                        continue;
                    }else{
                        odds = false;
                        break;
                    }
                }
            }else {
                byte index = 1;
                while (index < length){
                    if (list.get(index) % 2 == 1){
                        index += 2;
                        odds = true;
                        continue;
                    }else{
                        odds = false;
                        break;
                    }
                }
            }

            if (evens){
                byte index = 0;
                while (index < length){
                    if (list.get(index) % 2 == 0){
                        index += 2;
                        evens = true;
                        continue;
                    }else{
                        evens = false;
                        break;
                    }
                }
            }else {
                byte index = 0;
                while (index < length){
                    if (list.get(index) % 2 == 1){
                        index += 2;
                        evens = true;
                        continue;
                    }else{
                        evens = false;
                        break;
                    }
                }
            }

            if (odds && evens){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }


        }
    }
}
