import java.util.Scanner;
public class New_Year_And_Hurry {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte number_of_problems = scanner.nextByte();
        short time_to_get_to_the_party = scanner.nextShort();
        short time_he_has_to_solve_problems = (short) (240 - time_to_get_to_the_party);
        byte problems_solved = 0;
        for(byte i = 1; i <= number_of_problems; i++){
            short time_for_current_problem = (short) (5 * i);
            if (time_he_has_to_solve_problems - time_for_current_problem > 0) {
                problems_solved++;
                time_he_has_to_solve_problems -= time_for_current_problem;
            }else if(time_he_has_to_solve_problems - time_for_current_problem == 0){
                System.out.println(problems_solved + 1);
                break;
            }else{
                System.out.println(problems_solved);
                break;
            }
            if (i == number_of_problems){
                System.out.println(problems_solved);
            }
        }
    }
}
