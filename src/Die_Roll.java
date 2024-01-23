import java.util.Scanner;
public class Die_Roll {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte Y = scanner.nextByte();
        byte W = scanner.nextByte();
        byte max_of_Y_and_W = (byte) Math.max(Y, W);
        byte numerator = (byte) (6 - max_of_Y_and_W + 1);

        if (numerator == 4){
            System.out.println("2/3");
        }else{
            if (6 % numerator == 0){
                System.out.println(1 + "/" + 6 / numerator);
            }else{
                System.out.println(numerator + "/" + 6);
            }
        }

    }

}
