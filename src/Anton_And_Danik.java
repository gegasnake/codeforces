import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Anton_And_Danik {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number_of_games_played = scanner.nextInt();
        scanner.nextLine();
        String matches = scanner.nextLine();
        Map<Character, Integer> letterCountMap = new HashMap<>();
        for (char ch : matches.toCharArray()) {
            // Check if the character is a letter (ignore case)
            if (Character.isLetter(ch)) {
                // Update the count in the map
                letterCountMap.put(ch, letterCountMap.getOrDefault(ch, 0) + 1);
            }
        }
        if (letterCountMap.get('A') == null){
            System.out.println("Danik");
        }else if(letterCountMap.get('D') == null){
            System.out.println("Anton");
        }else if(letterCountMap.get('D') == null && letterCountMap.get('A') == null){
            System.out.println("Friendship");
        }else{
            if(letterCountMap.get('A') > letterCountMap.get('D')){
                System.out.println("Anton");
            }else if (letterCountMap.get('A') < letterCountMap.get('D')){
                System.out.println("Danik");
            }else{
                System.out.println("Friendship");
            }
        }


    }
}
