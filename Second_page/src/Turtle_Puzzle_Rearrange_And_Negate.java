import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Turtle_Puzzle_Rearrange_And_Negate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte n = scanner.nextByte();
            List<Integer> list = new ArrayList<>();
            for (byte x = 0; x < n; x++){
                list.add((int) scanner.nextByte());
            }


            list =  list.stream().map(Math::abs).collect(Collectors.toList());



            System.out.println(list.stream().reduce(Integer::sum).get());
            }





    }
}
