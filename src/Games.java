import java.util.Scanner;
public class Games {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte number_of_lines = scanner.nextByte();
        short count = 0;
        byte[][] colors = new byte[number_of_lines][2];
        for (byte i = 0; i < number_of_lines; i++){
            byte home_color = scanner.nextByte();
            byte guest_color = scanner.nextByte();
            colors[i][0] = home_color;
            colors[i][1] = guest_color;
        }

        for (byte i = 0; i < number_of_lines; i++){
            for (byte x = 0; x < number_of_lines; x++){
                if (colors[i][0] == colors[x][1]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
