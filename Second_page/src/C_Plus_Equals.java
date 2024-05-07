import java.util.Scanner;
public class C_Plus_Equals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte t = scanner.nextByte();
        int count = 0;
        for (byte i = 0; i < t; i++){
            int a = scanner.nextInt(), b = scanner.nextInt(), n = scanner.nextInt();
            while (n >= a && n >= b){
                if (a >= b){
                    b += a;
                    count++;
                }else{
                    a += b;
                    count++;
                }
            }

            System.out.println(count);
            count = 0;
        }
    }
}
