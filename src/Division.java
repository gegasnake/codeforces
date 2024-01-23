import java.util.Scanner;
public class Division {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            short rating = scanner.nextShort();
            if (rating <= 1399){
                System.out.println("Division 4");
            }else if(rating <= 1599){
                System.out.println("Division 3");
            }else if(rating <= 1899){
                System.out.println("Division 2");
            }else{
                System.out.println("Division 1");
            }
        }
    }
}
