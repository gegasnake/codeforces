import java.util.*;

public class Spy_Detected {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte test_cases = scanner.nextByte();
        for (byte i = 0; i < test_cases; i++) {
            Map<Byte, Byte> map= new HashMap<>();
            byte length = scanner.nextByte();
            byte[] array = new byte[length];
            byte count = 0;
            for (byte x = 0; x < length; x++){
                byte number = scanner.nextByte();
                if (map.containsKey(number)){
                    map.replace(number, (byte) (map.get(number) + 1));
                }else{
                    map.put(number, (byte) 1);
                }
                array[x] = number;
            }

            for (byte x = 0; x < length; x++){
                if (map.get(array[x]) == 1){
                    System.out.println(x + 1);
                }
            }


        }
    }
}
