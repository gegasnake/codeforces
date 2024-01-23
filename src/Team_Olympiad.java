import java.util.HashMap;
import java.util.Scanner;
public class Team_Olympiad {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short number_of_students = scanner.nextShort();
        HashMap[] array = new HashMap[number_of_students / 3];
        for (short i = 0; i < array.length; i++){
            array[i] = new HashMap<Byte, Short>();
        }
        short count = 0;
        for(short i = 1; i <= number_of_students; i++){
            byte skill = scanner.nextByte();
            for (short x = 0; x < array.length; x++){
                if (!array[x].containsKey(skill)){
                    array[x].put(skill, i);
                    break;
                }

            }
        }
        for (short i = 0; i < array.length; i++){
            if (array[i].size() == 3){
                count++;
            }
        }
        System.out.println(count);
        for (short i = 0; i < array.length; i++){
            if (array[i].size() == 3){
                System.out.println(array[i].get((byte) 1) + " " + array[i].get((byte) 2) + " " + array[i].get((byte) 3));

            }
        }
    }
}
