import java.util.Scanner;
public class Medium_Number{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte a = scanner.nextByte();
            byte b = scanner.nextByte();
            byte c = scanner.nextByte();
            byte min = (byte) Math.min(a, Math.min(b, c));
            byte max = (byte) Math.max(a, Math.max(b, c));
            if (a != min && a != max){
                System.out.println(a);
            }else if(b != min && b != max){
                System.out.println(b);
            }else{
                System.out.println(c);
            }

        }
    }
}
