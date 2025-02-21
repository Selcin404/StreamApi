import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddEvenSum {
    public static void sumOddAndEvenNumbers() {
        List<Integer> numbers = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());

        int oddSum = numbers.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
        int evenSum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();

        System.out.println("Tek sayıların toplamı: " + oddSum);
        System.out.println("Çift sayıların toplamı: " + evenSum);
    }
}
