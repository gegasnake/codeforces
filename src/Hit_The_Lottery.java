import java.util.Scanner;
public class Hit_The_Lottery {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int bill_count = 0;
        int money = scanner.nextInt();
        bill_count += money / 100;
        money %= 100;
        bill_count += money / 20;
        money %= 20;
        bill_count += money / 10;
        money %= 10;
        bill_count += money / 5;
        money %= 5;
        bill_count += money;
        System.out.println(bill_count);
    }
}
