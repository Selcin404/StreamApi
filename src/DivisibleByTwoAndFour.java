import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DivisibleByTwoAndFour {
    public static void countDivisibleByTwoAndFour() {
        List<Integer> numbers = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());

        long countDivBy2And4 = numbers.stream()
                .filter(n -> n % 2 == 0 && n % 4 == 0)
                .count();

        System.out.println("Hem 2 hem de 4 ile bölünebilen sayı adedi: " + countDivBy2And4);
    }
}
