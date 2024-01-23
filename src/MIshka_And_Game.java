import java.util.Scanner;
public class MIshka_And_Game {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte number_of_rounds = scanner.nextByte();
        byte mishka = 0;
        byte chris = 0;
        for (byte i = 0; i < number_of_rounds; i++){
            byte Mishka = scanner.nextByte();
            byte Chris = scanner.nextByte();
            if (Mishka > Chris){
                mishka++;
            }else if(Mishka < Chris){
                chris++;
            }else{
                continue;
            }
        }

        if (mishka > chris){
            System.out.println("Mishka");
        }else if(mishka < chris){
            System.out.println("Chris");
        }else{
            System.out.println("Friendship is magic!^^");
        }
    }
}
