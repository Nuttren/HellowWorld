import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task6();
        task7();
        task8();
        task9();
        task10 ();
        task11();



    }

    private static void task11() {
        int num = 1;
        int step = 2;
        int quantity = 10;
        for (int i = 0; i < quantity; i++) {
            System.out.print(num + " ");
            num += step;
        }
        System.out.println();
    }

    private static void task10() {
        int monthDuration = 31;
        int currentDay = 1;
        int daysOfWeek = 7;
        while (currentDay <= monthDuration) {
            System.out.print(currentDay + " " + (currentDay + 1) + " ");
            currentDay += daysOfWeek;
        }
        System.out.println();
    }

    private static void task9() {
        int userWantsToContinue = 1;
        int level = 1;
        do {
            System.out.println("Завершен уровень " + level);
            System.out.println("Хотите продолжить?");
            level++;
        }
            while (userWantsToContinue == 1 && level < 5) ;
        }



    private static void task8() {
        for (int yearPast = 1822; yearPast <= 2022; yearPast++) {
            if (yearPast % 79 == 0) {
                System.out.println(yearPast);
            }
        }
        for (int year = 2022; year <= 2122; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }






    private static void task7() {
        for (int i = 5; i <= 31; i++) {
            if (i % 7 ==0) {
                System.out.println("Сегодня пятница " + i + " число, пора готовить отчет");
            }
        }
    }

    private static void task6() {
        int total = 15_000;
        for (double i=1; i <=9; i = i + 0.5) {
            total = total + total * 7/100; {
                System.out.println("Год " + i + ", баланс равен " + total);
            }
        }
    }

    private static void task4() { // вместе 4 и 5

        int total = 15_000;
        for (int i=1; total <= 12_000_000; i++) {
            total = total + total * 7/100;
            if (i % 6 ==0) {
                System.out.println("Год " + i + ", баланс равен " + total);
            }
        }
    }

    private static void task3() {
        int population = 12_000_000;
        int birth = population * 17 / 1000;
        int death = population * 8 / 1000;
        int i = 1;
        while (i <= 10) {
            System.out.println("Год " + i + ", численность населения составляет " + population);
            i = i+1;
            population = population + birth - death;
        }
    }


    private static void task2() {
        int i = 1;
            while (i <= 10) {
                System.out.print(i);
                i = i + 1;
            }
        System.out.println();
        for (int s = 10; s >= 1; s = s - 1) {
            System.out.print(s);
        }
    }



    private static void task1() {
        int salary = 0;
        int i = 0;
        while (salary < 2_459_000) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + salary + " рублей");
            salary = salary + 15_000;
            i = i+1;
        }
    }
}