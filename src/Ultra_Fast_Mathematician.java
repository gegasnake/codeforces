import java.util.Scanner;
public class Ultra_Fast_Mathematician {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        StringBuilder sum = new StringBuilder();
        for (byte i = 0;  i < num1.length(); i++){
            if (num1.charAt(i) == num2.charAt(i)){
                sum.append('0');
            }else{
                sum.append('1');
            }
        }
        System.out.println(sum);
    }
}
