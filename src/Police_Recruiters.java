import java.util.Scanner;
public class Police_Recruiters {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int crime = 0;
        int police = 0;
        for (int i = 0; i < n; i++){
            byte input = scanner.nextByte();
            if (input >= 1){
                police += input;
            }else{
                if (police != 0){
                    police += input;
                }else{
                    crime += input;
                }
            }
        }
        
        System.out.print(crime * (-1));
    }
}
