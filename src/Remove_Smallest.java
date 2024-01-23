import java.util.Scanner;

public class Remove_Smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }

            if (canObtainSingleElementArray(n, a)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean canObtainSingleElementArray(int n, int[] a) {
        java.util.Arrays.sort(a);

        for (int i = 0; i < n - 1; i++) {
            if (a[i + 1] - a[i] > 1) {
                return false;
            }
        }

        return true;
    }
}
