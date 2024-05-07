import java.util.Scanner;
public class Vus_The_Cossack_And_A_Contest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte(), m = scanner.nextByte(), k = scanner.nextByte();
        if (n <= m && n <= k){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
