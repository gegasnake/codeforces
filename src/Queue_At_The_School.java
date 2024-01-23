import java.util.Scanner;
public class Queue_At_The_School {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short number_of_people = scanner.nextShort();
        byte time = scanner.nextByte();
        scanner.nextLine();
        String queue = scanner.nextLine();
        if (queue.length() == 1){
            System.out.println(queue);
        }else{
            char[] array0 = new char[number_of_people];
            for (short i = 0; i < number_of_people; i++){
                array0[i] = queue.charAt(i);
            }
            char[] array = new char[number_of_people];
            for (byte t = 0; t < time; t++){
                for (short i = 1; i < number_of_people; i++){
                    if (array0[i - 1] < array0[i]){
                        array[i - 1] = 'G';
                        array[i] = 'B';
                        i++;
                    }else{
                        array[i - 1] = array0[i - 1];
                    }
                    if (i == number_of_people - 1){
                        array[i] = array0[i];
                    }
                }
                array0 = array;
            }
            System.out.println(array);
        }

    }
}
