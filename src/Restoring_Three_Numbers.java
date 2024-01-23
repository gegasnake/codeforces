import java.util.Scanner;

public class Restoring_Three_Numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int max = Math.max(Math.max(x3, x4), Math.max(x1, x2));
        if (max - x1 != 0){
            System.out.print(max - x1 + " ");
        }
        if (max - x2 != 0){
            System.out.print(max - x2 + " ");
        }
        if (max - x3 != 0){
            System.out.print(max - x3 + " ");
        }
        if (max - x4 != 0){
            System.out.print(max - x4);
        }

    }
}
