import java.util.stream.Stream;

public class EvilPenguin {
    public static void main(String[] args) {
        Stream.of(1, 2, 3).map(zah1 -> {
            System.out.println("n" + zah1);
            return zah1 * 1.0;
        });
    }
}