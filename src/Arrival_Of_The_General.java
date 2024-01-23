import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Arrival_Of_The_General {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte number_of_soldiers = scanner.nextByte();
        byte height_to_compare = 101;
        HashMap<Byte, Byte> min_max_index= new HashMap<>();
        TreeSet<Byte> heights = new TreeSet<>();
        byte[] array = new byte[number_of_soldiers];
        for (byte i =0; i < number_of_soldiers; i++){
            byte height = scanner.nextByte();
            if (height <= height_to_compare){
                height_to_compare = height;
                min_max_index.put(height_to_compare, i);


            }
            heights.add(height);
            array[i] = height;

        }
        if (heights.size() == 1){
            System.out.println(0);
        }else{
            byte min = height_to_compare;
            height_to_compare = 0;

            for (byte i = 0; i < number_of_soldiers; i++){
                byte height = array[i];
                if (height > height_to_compare && height != min){
                    height_to_compare = height;
                    min_max_index.put(height_to_compare, i);
                }
                array[i] = height;

            }
            byte max = height_to_compare;
            if (min_max_index.get(max) > min_max_index.get(min)){
                System.out.println(number_of_soldiers - min_max_index.get(min) + min_max_index.get(max) - 2);
            }else{
                System.out.println(min_max_index.get(max) + number_of_soldiers - min_max_index.get(min) - 1);
            }
        }



    }
}

