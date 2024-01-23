import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bachgold_Problem {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            if (n % 2 == 0){
                for (int i = 0; i < n / 2; i++){
                    list.add(2);
                }
            }else{
                while (n != 0) {
                    if (n == 3){
                        n -= 3;
                        list.add(3);
                        break;
                    }
                    n -= 2;
                    list.add(2);

                }
            }


            System.out.println(list.size());
            for (int i = 0; i < list.size(); i++) {
                if (i != list.size() - 1) {
                    System.out.print(list.get(i) + " ");
                } else {
                    System.out.print(list.get(i));
                }

            }

        }
}
