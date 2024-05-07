import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Maximum_Increase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int prev = 0;
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int a = scanner.nextInt();
            if (a > prev){
                prev = a;
                count++;
                list.add(count);
            }else{
                prev = a;
                count = 1;
            }
        }
        System.out.println(list.stream().max(Integer::compareTo).get());
    }
}
