import java.util.Scanner;
public class Hulk {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte layers = scanner.nextByte();
        StringBuilder hulk_text = new StringBuilder();
        for (byte i = 0; i < layers; i++){
            if (i % 2 == 0){
                hulk_text.append("I hate ");
            }else{
                hulk_text.append("I love ");
            }
            if (i == layers - 1){
                hulk_text.append("it");
            }else{
                hulk_text.append("that ");
            }
        }
        System.out.println(hulk_text);
    }
}
