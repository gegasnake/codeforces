import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Rudolf_And_The_Ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte t = scanner.nextByte();
        for (byte i = 0; i < t; i++){
            byte n = scanner.nextByte(), m = scanner.nextByte();
            short k = scanner.nextShort();
            List<Short> left = new ArrayList<>();
            List<Short> right = new ArrayList<>();
            for (byte l = 0; l < n; l++){
                left.add(scanner.nextShort());
            }
            for (byte r = 0; r < m; r++){
                right.add(scanner.nextShort());
            }
            int answer = 0;
            for (byte l = 0; l < n; l++){
                for (byte r = 0; r < m; r++){
                    if (left.get(l) >= k){
                        continue;
                    }else if(left.get(l) + right.get(r) <= k){
                        answer++;
                    }
                }
            }

            System.out.println(answer);


        }
    }
}
