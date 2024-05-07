import java.util.*;

public class Advantage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            int length = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int x = 0; x < length; x++){
                list.add(scanner.nextInt());
            }
            Object[] list2 = list.toArray();
            Collections.sort(list);
            for (int x = 0; x < length; x++){
                if (!Objects.equals(list2[x], list.get(length - 1))){
                    System.out.print((Integer) list2[x] - list.get(length - 1) + " ");
                }else{
                    System.out.print(list.get(length - 1) - list.get(length - 2) + " ");
                }
            }
            System.out.println();
        }
    }
}
