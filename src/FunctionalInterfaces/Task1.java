package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task1 {
    public static void main(String[] args) {
        Predicate <Integer> positive = i -> i >0;
        System.out.println(positive.test(5));
        System.out.println(positive.test(-10));
        System.out.println("______________________________");
        Predicate <Integer> positive1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };
        System.out.println(positive1.test(5));
        System.out.println(positive1.test(0));

    }
}
