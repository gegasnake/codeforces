import java.util.Scanner;
public class George_And_Accommodation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte number_of_rooms = scanner.nextByte();
        byte free_room_count = 0;
        for (byte i = 0; i < number_of_rooms; i++){
            byte people_in_the_room = scanner.nextByte();
            byte max_people = scanner.nextByte();
            if (max_people - people_in_the_room >= 2){
                free_room_count++;
            }
        }
        System.out.println(free_room_count);
    }
}
