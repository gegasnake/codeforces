import java.util.Scanner;

public class Sereja_And_Dima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_of_cards = scanner.nextInt();
        int[] array = new int[number_of_cards];

        for (int i = 0; i < number_of_cards; i++) {
            int card = scanner.nextInt();
            array[i] = card;
        }

        int sereja = 0;
        int dima = 0;
        int left = 0;
        int right = number_of_cards - 1;

        boolean serejaTurn = true;
        while (left <= right) {
            int chosenCard;
            if (array[left] >= array[right]) {
                chosenCard = array[left];
                left++;
            } else {
                chosenCard = array[right];
                right--;
            }

            if (serejaTurn) {
                sereja += chosenCard;
            } else {
                dima += chosenCard;
            }

            serejaTurn = !serejaTurn;
        }

        System.out.println(sereja + " " + dima);
    }
}
