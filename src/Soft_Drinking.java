import java.util.Scanner;

public class Soft_Drinking {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort();
        short k = scanner.nextShort();
        short l = scanner.nextShort();
        short c = scanner.nextShort();
        short d = scanner.nextShort();
        short p = scanner.nextShort();
        short nl = scanner.nextShort();
        short np = scanner.nextShort();

        System.out.println(Math.min(Math.min(c * d, k * l / nl), p / np) / n);
    }
}
