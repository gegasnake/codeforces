import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.NavigableSet;
public class Tram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short stops = scanner.nextShort();
        NavigableSet<Integer> treeSet = new TreeSet<>();
        int people_in_tram = 0;
        for (short i = 0; i < stops; i++){
            short out = scanner.nextShort();
            short enter = scanner.nextShort();
            people_in_tram = people_in_tram - out + enter;
            treeSet.add(people_in_tram);
        }

        System.out.println(treeSet.last());
    }
}
