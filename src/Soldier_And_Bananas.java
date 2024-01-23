import java.util.Scanner;

public class Soldier_And_Bananas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();
        long w = scanner.nextLong();
        long n = scanner.nextLong();
        long whole_money_soldier_needs = ((n * (n + 1)) / 2) * k;
        if (whole_money_soldier_needs - w > 0){
            System.out.println(whole_money_soldier_needs - w);
        }else{
            System.out.println(0);
        }
    }



}
