import java.util.Scanner;
public class Domino_Piling {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte length = scanner.nextByte();
        byte width = scanner.nextByte();
        System.out.println(length * width / 2);
    }
}
