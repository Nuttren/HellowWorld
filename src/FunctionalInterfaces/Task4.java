package FunctionalInterfaces;

import java.util.function.Supplier;

public class Task4 {
    public static void main(String[] args) {
        Supplier <Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random()*100);
            }
        };
        System.out.println(supplier.get());
        System.out.println("______________________________");
        Supplier <Integer> supplier1 = () -> (int) (Math.random()*100);
        System.out.println(supplier1.get());
    }
}
