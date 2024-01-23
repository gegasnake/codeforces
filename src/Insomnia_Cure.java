import java.util.Scanner;
public class Insomnia_Cure {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte k = scanner.nextByte();
        byte l = scanner.nextByte();
        byte m = scanner.nextByte();
        byte n = scanner.nextByte();
        int d = scanner.nextInt();
        int count = 0;
        if (k == 1 || l == 1 || m == 1 || n == 1){
            System.out.println(d);
        }else{
            for (int i = 1; i <= d; i++){
                if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
