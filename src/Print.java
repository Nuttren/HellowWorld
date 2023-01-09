public class Print {
    public static void main(String[] args) {
        Book LordOfTheRings = new Book("Властелин Колец", new Author("Джон", "Толкин"), 2000);
        System.out.println("Название книги = " + LordOfTheRings.getBookName());
        System.out.println("Год выпуска книги = " + LordOfTheRings.getBookAge());
        Author JohnTolkien = new Author("Джон", "Толкин");
        System.out.println("Имя автора = " + JohnTolkien.getAuthorFirstName());
        System.out.println("Фамилия автора = " + JohnTolkien.getAuthorSecondName());
        System.out.println();
        Book HarryPotter = new Book("Гарри Поттер", new Author("Джоан", "Роулинг"), 2001);
        System.out.println("Название книги = " + HarryPotter.getBookName());
        HarryPotter.setBookAge(3000);
        System.out.println("Год выпуска книги = " + HarryPotter.getBookAge());
        Author JoanRouling = new Author("Джоан", "Роулинг");
        System.out.println("Имя автора = " + JoanRouling.getAuthorFirstName());
        System.out.println("Фамилия автора = " + JoanRouling.getAuthorSecondName());
    }
}
