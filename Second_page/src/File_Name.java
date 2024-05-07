import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class File_Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        String s = scanner.next();
        int count = 0;
        List<Integer> count_list = new ArrayList<>();
        for (byte i = 0; i < n; i++){
            if (s.charAt(i) == 'x'){
                count++;
            }else{
                count_list.add(count);
                count = 0;
            }
        }
        count_list.add(count);

        System.out.println(count_list.stream().filter(x -> x > 2).map(x -> x - 2).reduce(0, Integer::sum));
    }
}
