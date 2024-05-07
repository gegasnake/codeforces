import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Cypher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        for (byte i = 0; i < test_cases; i++){
            byte number_of_wheels = scanner.nextByte();
            List<Byte> list_of_digits_at_the_start = new ArrayList<>();
            for (byte wheel = 0; wheel < number_of_wheels; wheel++){
                list_of_digits_at_the_start.add(scanner.nextByte());
            }

            for (byte x = 0; x< number_of_wheels; x++){
                byte l = scanner.nextByte();
                String s = scanner.next();
                byte value = list_of_digits_at_the_start.get(x);
                for (byte k = 0; k < l; k++){
                    if (s.charAt(k) == 'U'){
                        if (value == 0){
                            value = 9;
                        }else{
                            value--;
                        }
                    }else{
                        if (value == 9){
                            value = 0;
                        }else{
                            value++;
                        }
                    }
                }

                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
