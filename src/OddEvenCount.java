import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddEvenCount {
    public static void countOddAndEvenNumbers() {
        List<Integer> numbers = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());

        long oddCount = numbers.stream().filter(n -> n % 2 != 0).count();
        long evenCount = numbers.stream().filter(n -> n % 2 == 0).count();

        System.out.println("Tek sayı adedi: " + oddCount);
        System.out.println("Çift sayı adedi: " + evenCount);
    }
}

