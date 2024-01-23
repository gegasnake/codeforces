import java.util.Objects;
import java.util.Scanner;
public class Magnets {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number_of_magnets = scanner.nextInt();
        scanner.nextLine();
        String prev_magnet = scanner.nextLine();
        int groups = 0;
        for (int i = 1; i < number_of_magnets; i++){
            String magnet = scanner.nextLine();
            if (!Objects.equals(magnet, prev_magnet)){
                groups++;
                prev_magnet = magnet;
            }

        }
        System.out.println(groups + 1);
    }
}
