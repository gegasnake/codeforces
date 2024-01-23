import java.util.Scanner;
public class Minimal_Square {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte side_a = scanner.nextByte();
            byte side_b = scanner.nextByte();
            if (side_a > side_b && side_a >= side_b * 2){
                System.out.println(side_a * side_a);
            }else if(side_a >= side_b && side_a <= side_b * 2){
                System.out.println(side_b * side_b * 4);
            }else if(side_b > side_a && side_b >= side_a * 2){
                System.out.println(side_b * side_b);
            }else{
                System.out.println(side_a * side_a * 4);
            }
        }
    }
}
