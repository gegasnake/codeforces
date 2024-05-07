import java.util.Scanner;
public class Make_It_White {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short t = scanner.nextShort();
        for (short i = 0; i < t; i++){
            byte length = scanner.nextByte();
            String s = scanner.next();
            byte min_black_index = 0;
            byte max_black_index = 0;
            if (!s.contains("B")){
                System.out.println(0);
            }else{
                while(s.charAt(min_black_index) != 'B'){
                    min_black_index++;
                }
                max_black_index = min_black_index;
                while(s.substring(min_black_index).contains("B")){
                    min_black_index++;
                }

                System.out.println(min_black_index - max_black_index);
            }

        }
    }
}
