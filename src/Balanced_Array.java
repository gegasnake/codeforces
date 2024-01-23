import java.util.Arrays;
import java.util.Scanner;
public class Balanced_Array {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            int even_length = scanner.nextInt();
            if ((even_length / 2) % 2 == 1) {
                System.out.println("NO");
            }else{
                int[] array = new int[even_length];
                int odd = 1;
                int even = 2;
                int sum_of_even = 0;
                int sum_of_odd = 0;
                for (int x = 0; x < even_length / 2; x++){
                    array[x] = even;
                    array[even_length / 2 + x] = odd;
                    sum_of_odd += odd;
                    sum_of_even += even;
                    even += 2;
                    odd += 2;
                }

                array[even_length - 1] = sum_of_even - sum_of_odd + array[even_length - 1];
                System.out.println("YES");
                for (int x = 0; x < even_length; x++){
                    if (x != even_length - 1){
                        System.out.print(array[x] + " ");
                    }else{
                        System.out.println(array[x]);
                    }

                }

            }
        }
    }
}
