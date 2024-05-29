import java.util.Arrays;
import java.util.List;
import java.util.Stream.Collectors;

public class SortListExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);

        List<Integer> sortedNumbers = numbers.stream()
        .sorted() //ordena a Stream em ordem natural(crescente para numeros)
        .collect(Collectors.toList());

        sortedNumber.forEach(System.out::println);
    }
}

