import java.util.Scanner;
public class Borze {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String borze = scanner.next();
        StringBuilder builder = new StringBuilder();
        for (short x = 0; x < borze.length(); x++){
            if (borze.charAt(x) == '-' && borze.charAt(x + 1) == '.'){
                builder.append(1);
                x++;
            }else if(borze.charAt(x) == '-' && borze.charAt(x + 1) == '-'){
                builder.append(2);
                x++;
            }else if(borze.charAt(x) == '.'){
                builder.append(0);
            }
        }
        System.out.println(builder);
    }
}
