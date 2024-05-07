import java.util.Scanner;

public class Upscaling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        for (byte i = 0; i < test_cases; i++) {
            byte n  = scanner.nextByte();
            String s = "";
            for (byte j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (j % 2 == 0 && k % 2 == 0) {
                        s += "##";
                    }else if(j % 2 == 0){
                        s += "..";
                    }else if (j % 2 == 1 && k % 2 == 0){
                        s += "..";
                    }else{
                        s += "##";
                    }
                }
                System.out.println(s);
                System.out.println(s);
                s = "";
            }
        }
    }
}
