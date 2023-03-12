package FunctionalInterfaces;

import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        Function <Double, Long> round = new Function<>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        System.out.println(round.apply(5.1545));
        System.out.println(round.apply(57.7545));
        System.out.println("_____________________________");
        Function <Double, Long> round1 = Math::round;
        System.out.println(round1.apply(5.1545));
        System.out.println(round1.apply(57.7545));
        System.out.println("_____________________________");
        Function <Double, Long> round2 = d -> Math.round(d);
        System.out.println(round2.apply(5.1545));
        System.out.println(round2.apply(57.7545));
    }

}
