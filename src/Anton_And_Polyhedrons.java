import java.util.HashMap;
import java.util.Scanner;
public class Anton_And_Polyhedrons {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number_of_figures = scanner.nextInt();
        HashMap<String, Byte> figures = new HashMap<>();
        int faces = 0;
        figures.put("Tetrahedron", (byte) 4);
        figures.put("Cube", (byte) 6);
        figures.put("Octahedron", (byte) 8);
        figures.put("Dodecahedron", (byte) 12);
        figures.put("Icosahedron", (byte) 20);
        for (int i = 0; i < number_of_figures; i++){
            String figure = scanner.next();
            faces += figures.get(figure);
        }
        System.out.println(faces);
    }
}
