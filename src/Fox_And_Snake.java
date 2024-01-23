import java.util.Scanner;
public class Fox_And_Snake {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        byte m = scanner.nextByte();
        for (byte i = 0; i < n; i++){
            for (byte x = 0; x < m; x++){
                if (i % 2 == 0){
                    System.out.print("#");
                }else if (i % 4 == 3 && x == 0){
                    System.out.print("#");
                }else if(i % 2 == 1 && i % 4 != 3 && x == m -1){
                    System.out.print("#");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
