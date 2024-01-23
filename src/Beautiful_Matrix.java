import java.util.Scanner;
public class Beautiful_Matrix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte[][] array_of_numbers = new byte[5][5];
        byte row = 0, column = 0;
        for (byte i = 0; i < 5; i++){
            for (byte x = 0; x < 5; x++){
                byte number = scanner.nextByte();
                if (number == 1){
                    row = (byte) (i + 1);
                    column = (byte) (x + 1);
                }
                array_of_numbers[i][x] = number;
            }
        }
        byte length_between_rows = (byte) (row - 3);
        byte length_between_columns = (byte) (column - 3);
        if (length_between_rows < 0){
            length_between_rows *= -1;
        }
        if (length_between_columns < 0){
            length_between_columns *= -1;
        }

        System.out.println(length_between_columns + length_between_rows);

    }
}
