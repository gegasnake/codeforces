import java.util.Scanner;
public class Target_Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            short count = 0;
            for (byte x = 0; x < 10; x++){
                String s = scanner.next();
                for (byte l = 0; l < 10; l++){
                    if (s.contains("X")){
                        if (s.charAt(l) == 'X'){
                            if (x == 0 || l == 0 || l == 9 || x == 9){
                                count++;
                            }else if(((x == 1 || x == 8) && (l > 0 && l < 9)) || (x > 1 && x < 8 && l == 1 || l == 8)){
                                count += 2;
                            }else if(((x == 2 || x == 7) && (l > 1 && l < 8)) || (x > 2 && x < 7 && l == 2 || l == 7)){
                                count += 3;
                            }else if(((x == 3 || x == 6) && (l > 2 && l < 7)) || (x > 3 && x < 6 && l == 3 || l == 6)){
                                count += 4;
                            }else if ((x == 4 || x == 5) && (l == 4 || l == 5)){
                                count += 5;
                            }
                        }
                    }
                }

            }

            System.out.println(count);
        }
    }
}
