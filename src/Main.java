import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();



    }

    private static void task5() {
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }

    private static void task4() {
        int distance = 110;
        if (distance < 20) {
            System.out.println("Потребуется: одни сутки"); }
                     if (distance > 20 && distance < 60) {
                        System.out.println("Потребуется: двое суток");
                    }
                    if (distance > 60 && distance < 100) {
                        System.out.println("Потребуется: трое суток");
                    }
                    if (distance > 100) {
                     System.out.println("Доставки нет");
                    }
        }



    private static void task3() {
        char year = 2024;
        if (year % 4 == 0) {
            if ((year % 100 != 0) && (year % 400 != 0)) {
                System.out.println("Високосный");
            } else {
                System.out.println("Невисокосный");
            }
        }
    }


    private static void task2() {
        char clientOS = 1;
        char clientDeviceYear = 2016;
        if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }

    private static void task1() {
        char clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
}

