import java.util.Scanner;
public class The_New_Year_Meeting_Friends {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte x1 = scanner.nextByte();
        byte x2 = scanner.nextByte();
        byte x3 = scanner.nextByte();
        byte min = (byte) Math.min(Math.min(x1, x2), x3);
        byte max = (byte) Math.max(Math.max(x1, x2), x3);
        byte medium = 0;
        if (x1 != max && x1 != min){
            medium = x1;
        }else if(x2 != max && x2 != min){
            medium = x2;
        }else{
            medium = x3;
        }

        System.out.println(medium - min + max - medium);
    }
}
