import java.util.Scanner;
public class Perfect_Permutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        if (n % 2 == 1) {
            System.out.println(-1);
        }else {
            byte[] array_odds = new byte[n / 2];
            byte[] array_evens = new byte[n / 2];
            byte odd_index = 0;
            byte even_index = 0;
            for (byte i = 1; i <= n; i++) {
                if (i % 2 == 1){
                    array_odds[odd_index] = i;
                    odd_index++;
                }else{
                    array_evens[even_index] = i;
                    even_index++;
                }
            }
            for (byte i = 0; i < n / 2; i++){
                System.out.print(array_evens[i] + " ");
                if (i != n / 2 - 1){
                    System.out.print(array_odds[i] + " ");
                }else{
                    System.out.println(array_odds[i]);
                }
            }
        }
    }
}
