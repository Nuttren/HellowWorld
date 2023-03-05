package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Task2 {
    public static void main(String[] args) {
        Person person1 = new Person("Иван Иванов");
        Person person2 = new Person("Петр Петров");
        Person person3 = new Person("Роман Романов");
        List <Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        Consumer <Person> consumer = person -> System.out.println("Привет " + person.getName());
        for (Person person : people) {
            consumer.accept(person);
        }
        System.out.println("__________________________________________");
        Consumer <Person> consumer1 = new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println("Привет " + person.getName());
            }
        };
        for (Person person : people) {
            consumer1.accept(person);
        }
}
}


class Person {
    private String Name;

    public String getName() {
        return Name;
    }

    public Person(String name) {
        Name = name;
    }
}