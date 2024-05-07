import java.util.Scanner;

public class Special_Permutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();  // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();  // Length of the permutation
            printPermutation(n);
        }
    }

    static void printPermutation(int n) {
        int middle = 0;
        for (int i = n; i >= 1; i--) {
            if ((i == n / 2 && n % 2 == 0) || (i == n / 2 + 1 && n % 2 == 1)){
                middle = i;
            }else{
                System.out.print(i + " ");
            }

        }
        System.out.print(middle);
        System.out.println();
    }
}
