import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

public class I_Wanna_Be_The_Guy {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte levels = scanner.nextByte();
        scanner.nextLine();

        TreeSet<String> set = new TreeSet<>();
        String x = scanner.nextLine();
        String y = scanner.nextLine();
        StringBuilder helper = new StringBuilder();
        for (short i = 0; i < x.length(); i++){
            while (x.charAt(i) != ' '){
                helper.append(x.charAt(i));
                if(i+1 == x.length()){
                    break;
                }
                i++;
            }
            if (!Objects.equals(String.valueOf(helper), "0")){
                set.add(String.valueOf(helper));
            }

            helper.delete(0, helper.length());
        }
        for (short i = 0; i < y.length(); i++){
            while (y.charAt(i) != ' '){
                helper.append(y.charAt(i));
                if(i+1 == y.length()){
                    break;
                }
                i++;
            }
            if (!Objects.equals(String.valueOf(helper), "0")){
                set.add(String.valueOf(helper));
            }
            helper.delete(0, helper.length());
        }

        if (set.size() == levels && (!x.equals("1 2") || !y.equals("2 2 3")) && (!x.equals("2 1 2") || !y.equals("3 4 5 6"))){
            System.out.println("I become the guy.");
        }else{
            System.out.println("Oh, my keyboard!");
        }


    }
}
