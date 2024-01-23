import java.util.Scanner;
public class Dislike_Of_Threes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        short[] array = new short[1001];
        short i = 0;
        short index = 0;
        while (index < 1001  && i <= 1666){
            if (i % 3 != 0 && i % 10 != 3){
                array[index] = i;
                index++;
            }
            i++;
        }
        for (byte x = 0; x < test_cases; x++){
            short k = scanner.nextShort();
            System.out.println(array[k - 1]);
        }
    }
}
