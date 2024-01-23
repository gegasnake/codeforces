import java.util.Scanner;

public class Next_Round {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte num_of_participants= scanner.nextByte();
        byte main_participant_to_compare_index= scanner.nextByte();
        byte number_of_winners = 0;
        byte[] number_array = new byte[num_of_participants];
        for (byte i = 0; i < num_of_participants; i++){
            number_array[i] = scanner.nextByte();
            if (number_array[main_participant_to_compare_index - 1] <= number_array[i] && number_array[i] != 0){
                number_of_winners++;
            }

        }




        System.out.println(number_of_winners);








    }
}
