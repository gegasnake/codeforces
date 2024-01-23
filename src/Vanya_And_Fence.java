import java.util.Scanner;
public class Vanya_And_Fence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short number_of_friends = scanner.nextShort();
        short fence_height = scanner.nextShort();
        short width = 0;
        for (short i = 0; i < number_of_friends; i++){
            short friend_height = scanner.nextShort();
            if (friend_height > fence_height){
                width+=2;
            }else{
                width++;
            }
        }

        System.out.println(width);
    }
}
