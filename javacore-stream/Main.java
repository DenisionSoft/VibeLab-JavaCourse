import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Stream;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;

public class Main
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<String> words = asList(text.toLowerCase().split("\\W+"));

        Stream<Map.Entry<String, Long>> sorted = words.stream()
                .collect(groupingBy(String::valueOf, counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()));

        sorted.limit(10).toList().forEach(e -> System.out.println(e.getKey()));
    }
}