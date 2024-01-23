import java.util.Scanner;

public class Team {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // getting a number of problems
        int problem_number = scanner.nextInt();

        // Consume the newline character
        scanner.nextLine();

        int number_of_known_problems = 0;
        /* creating a loop to see every human's problem knowledge and if two or more people
        know how to solve a problem it will increment a value of known problems by one*/
        for (int i = 0; i < problem_number; i++){
            String team_knowledge = scanner.nextLine();
            // getting the knowledge of every team member one by one
            byte petya = (byte) team_knowledge.charAt(0);
            byte vasya = (byte) team_knowledge.charAt(2);
            byte tonya = (byte) team_knowledge.charAt(4);

            if (petya + vasya + tonya >= 146){
                number_of_known_problems++;
            }

        }
        scanner.close();
        // we output the answer:
        System.out.println(number_of_known_problems);

    }
}
