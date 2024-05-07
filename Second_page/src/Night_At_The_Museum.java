import java.util.Scanner;
public class Night_At_The_Museum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exhibit = scanner.next();
        char current = 'a';
        short count = 0;
        for (byte i = 0; i < exhibit.length(); i++){
            if ((Math.abs(exhibit.charAt(i) - current)) > 13){
                count += (short) (26 - (Math.abs(exhibit.charAt(i) - current)));
            }else{
                count += (short) (Math.abs(exhibit.charAt(i) - current));
            }

            current = exhibit.charAt(i);
        }
        System.out.println(count);

    }
}
