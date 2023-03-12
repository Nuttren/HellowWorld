package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static <Cat> void findMinMax(
            Stream<? extends Cat> stream,
            Comparator<? super Cat> order,
            BiConsumer<? super Cat, ? super Cat> minMaxConsumer) {

        List<Cat> items = stream.sorted(order).collect(Collectors.toList());
        if (!items.isEmpty()) {
            minMaxConsumer.accept(items.get(0), items.get(items.size() - 1));

        } else {
            minMaxConsumer.accept(null, null);
        }
    }
    public static void main(String[] args) throws Exception {
        Stream<Cat> stream = Stream.of(
                new Cat("Тузик", 5, "Сиамский"),
                new Cat("Кузя", 7, "Персидский"),
                new Cat("Трактор", 12, "Шотландский"),
                new Cat("Мурзик", 11, "Незивестный"),
                new Cat("Рыжик", 20, "Бенгальский"));

        findMinMax(
                stream,
                Comparator.naturalOrder(),
                (x, y) -> System.out.printf("min: %s, max: %s%n", x, y)
        );

        stream.close();
    }
}

