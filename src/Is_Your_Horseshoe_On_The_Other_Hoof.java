import java.util.Scanner;
import java.util.TreeSet;
public class Is_Your_Horseshoe_On_The_Other_Hoof {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        for (byte i = 0; i < 4; i++){
            int color = scanner.nextInt();
            set.add(color);
        }
        System.out.println(4 - set.size());
    }
}
