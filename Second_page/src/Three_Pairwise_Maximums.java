import java.util.Scanner;
public class Three_Pairwise_Maximums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            int x = scanner.nextInt(), y = scanner.nextInt(), z = scanner.nextInt();
            if (x == y && x >= z){
                System.out.println("YES");
                System.out.println(x + " " + z + " " + z);
            }else if(x == z && x >= y){
                System.out.println("YES");
                System.out.println(x + " " + y + " " + y);
            }else if(z == y && z >= x){
                System.out.println("YES");
                System.out.println(z + " " + x + " " + x);
            }else{
                System.out.println("NO");
            }

        }
    }
}
