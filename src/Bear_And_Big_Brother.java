import java.util.Scanner;
public class Bear_And_Big_Brother {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short weight_of_Limak = scanner.nextShort();
        short weight_of_Bob = scanner.nextShort();
        byte x = 0;
        while (weight_of_Limak <= weight_of_Bob){
            weight_of_Limak *= 3;
            weight_of_Bob *= 2;
            x++;
        }
        System.out.println(x);
    }
}
