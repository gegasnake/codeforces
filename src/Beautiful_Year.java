import java.util.Scanner;
import java.util.TreeSet;

public class Beautiful_Year {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short year = scanner.nextShort();
        TreeSet<Byte> set = new TreeSet<>();
        while (set.size() != 4){
            year++;
            set.clear();
            set.add((byte) (year / 1000));
            set.add((byte) (year / 100 % 10));
            set.add((byte) (year / 10 % 10));
            set.add((byte) (year % 10));
        }
        System.out.println(year);
    }
}
