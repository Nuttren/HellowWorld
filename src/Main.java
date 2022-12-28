import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    private static void task3() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }

    private static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    private static void task1() {
        String firstName = "Роман";
        String middleName = "Алексеевич";
        String lastName = "Шереметьев";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
    }
    }


