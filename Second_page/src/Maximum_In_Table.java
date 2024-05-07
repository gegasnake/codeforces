import java.util.Scanner;
public class Maximum_In_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        int[][] array = new int[n][n];
        for (byte i = 0; i < n; i++){
            for (byte j = 0; j < n; j++){
                if (i == 0 || j == 0){
                    array[i][j] = 1;
                }else{
                    array[i][j] = array[i][j-1] + array[i-1][j];
                }
            }
        }
        System.out.println(array[n - 1][n - 1]);
    }
}
