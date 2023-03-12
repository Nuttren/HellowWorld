package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> someList = Arrays.asList(1, 2, 3, 4, 5, 6, 0, 9, 4, null);
        List<Integer> evenNumberList = someList.stream()
                .filter(Objects::nonNull)
                .filter(i -> i%2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumberList);
    }
}
