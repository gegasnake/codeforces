import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class Fair_Playoff {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short test_cases = scanner.nextShort();
        for (short i = 0; i < test_cases; i++){
            byte skill1 = scanner.nextByte();
            byte skill2 = scanner.nextByte();
            byte skill3 = scanner.nextByte();
            byte skill4 = scanner.nextByte();
            HashSet<Byte> group1 = new HashSet<>();
            group1.add(skill1);
            group1.add(skill2);
            HashSet<Byte> group2 = new HashSet<>();
            group2.add(skill3);
            group2.add(skill4);
            byte[] array = new byte[4];
            array[0] = skill1;
            array[1] = skill2;
            array[2] = skill3;
            array[3] = skill4;
            Arrays.sort(array);
            if ((group1.contains(array[3]) && group1.contains(array[2])) || (group2.contains(array[3]) && group2.contains(array[2]))){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
