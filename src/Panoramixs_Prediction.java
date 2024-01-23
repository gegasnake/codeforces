import java.util.Scanner;
public class Panoramixs_Prediction {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        byte m = scanner.nextByte();
        boolean True = true;
        byte count = 0;
        for (byte i = 1; i <= n; i++){
            if (n % i == 0){
                count++;
            }
        }

        if (count != 2){
            System.out.println("NO");
        }else{
            count = 0;
            for (byte i = 1; i <= m; i++){
                if (m % i == 0){
                    count++;
                }
            }
            if (count != 2){
                System.out.println("NO");
            }else{
                boolean is_true = true;
                for (byte i = (byte) (n + 1); i < m; i++){
                    count = 0;
                    for (byte x = 1; x <= i; x++){
                        if (i % x == 0){
                            count++;
                        }
                    }
                    if (count == 2){
                        System.out.println("NO");
                        is_true = false;
                        break;
                    }
                }
                if (is_true){
                    System.out.println("YES");
                }
            }
        }
    }
}
