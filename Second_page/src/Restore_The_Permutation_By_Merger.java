import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Restore_The_Permutation_By_Merger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte n = scanner.nextByte();
            List<Byte> list = new ArrayList<>();
            for (byte j = 0; j < n * 2; j++){
                byte a = scanner.nextByte();
                if (!list.contains(a)){
                    list.add(a);
                    if (j != n * 2 - 1){
                        System.out.print(a + " ");
                    }else{
                        System.out.println(a);
                        System.out.println();
                    }

                }
            }

        }
    }
}
