import java.util.Scanner;

public class Food_For_Animals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short t = scanner.nextShort();
        for (short i = 0; i < t; i++) {
            int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(), x = scanner.nextInt(), y = scanner.nextInt();
            // If there are enough dog food packs and enough universal food packs
            if (a >= x && c >= Math.max(0, y - b)) {
                System.out.println("YES");
            }
            // If there are enough cat food packs and enough universal food packs
            else if (b >= y && c >= Math.max(0, x - a)) {
                System.out.println("YES");
            }
            // If there are enough universal food packs to cover the shortage
            else if (c >= x + y - Math.min(a, x) - Math.min(b, y)) {
                System.out.println("YES");
            }
            // Otherwise, it's not possible to buy suitable food for all animals
            else {
                System.out.println("NO");
            }
        }
    }
}
