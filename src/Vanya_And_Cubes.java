import java.util.Scanner;
public class Vanya_And_Cubes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort();
        short k = 1;
        short l = 0;
        while (l <= n){
            l += (short) (k * (k + 1) / 2);
            if (l <= n){
                k++;
            }


        }
        if (l == 1) {
            System.out.println(1);
        }else{
            System.out.println(k - 1);
        }

    }
}
