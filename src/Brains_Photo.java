import java.util.HashSet;
import java.util.Scanner;
public class Brains_Photo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte rows = scanner.nextByte();
        byte columns = scanner.nextByte();
        HashSet<String> set = new HashSet<>();
        set.add("C");
        set.add("Y");
        set.add("M");
        boolean colorful = false;
        for (byte row = 0; row < rows; row++){
            for (byte column = 0; column < columns; column++){
                String character = scanner.next();
                if (set.contains(character)){
                    colorful = true;
                    break;
                }
            }
        }

        if (colorful){
            System.out.println("#Color");
        }else{
            System.out.println("#Black&White");
        }

    }
}
