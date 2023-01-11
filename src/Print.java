public class Print {
    public static void main(String[] args) {
        Book LordOfTheRings = new Book("Властелин Колец", new Author("Джон", "Толкин"), 2000);
        System.out.println(LordOfTheRings);
        System.out.println();
        Book HarryPotter = new Book("Гарри Поттер", new Author("Джоан", "Роулинг"), 2001);
        System.out.println(HarryPotter);
    }
}
