import java.util.Scanner;
public class Buy_A_Shovel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short price_of_the_shovel = scanner.nextShort();
        byte denomination = scanner.nextByte();
        byte x = 1;
        short sum = 0;
        while ((sum + price_of_the_shovel) % 10 != denomination){
            sum += price_of_the_shovel;
            if (sum % 10 == 0 && sum != 0){
                break;
            }

            x++;
        }
        System.out.println(x);
    }
}
