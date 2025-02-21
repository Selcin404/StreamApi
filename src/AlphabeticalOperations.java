import java.util.List;
import java.util.stream.Collectors;

public class AlphabeticalOperations {
    public static void alphabeticalOperations() {
        List<String> words = List.of("Elma", "Armut", "Muz", "Karpuz", "Kiraz", "Çilek", "Üzüm");

        List<String> startsWithA = words.stream()
                .filter(word -> word.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("A harfi ile başlayan kelimeler: " + startsWithA);

        List<String> sortedWords = words.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Alfabetik sıralama: " + sortedWords);

        words.stream()
                .map(word -> word + " - uzunluk: " + word.length())
                .forEach(System.out::println);
    }
}

