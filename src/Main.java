import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();




    }

    private static void task7() {
        int sec = 7925;
        int secInHour = 3600;
        int totalWorkingHours = 8;
        int restWorkSec = secInHour * totalWorkingHours - sec;
        float restWorkHour = totalWorkingHours - sec / secInHour;
        {
            if ((sec >= 0) && (sec < secInHour * totalWorkingHours)) {
                System.out.println("До конца рабочего дня осталось " + restWorkSec + " секунд");}
            if ((sec >= 0) && (sec < secInHour * totalWorkingHours)) {
                System.out.println("До конца рабочего дня осталось " + restWorkHour + " часов");}
            else {
                    System.out.println("Рабочий день не начался");
                }
            }

    }

    private static void task6() {
        int a = 87;
        int b = 3;
        int c = -1268;
        if (a>=b && a>=c) {
            if (b>=c) {
                System.out.println(c + " " + b + " " + a);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        }
        if (b>=a && b>=c) {
            if (a>=c) {
                System.out.println(c + " " + a + " " +b);
            }
            if (c>=a) {
                System.out.println(a + " " + c + " " +b);
            }
        }
        if (c>=a && c>=b) {
            if (a>=b) {
                System.out.println(b + " " + a +" " + c);
            }
            if (b>=a) {
                System.out.println(a + " " + b +" " + c);
            }
        }
    }

    private static void task5() {
        int monthNumber = 3;
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
        int distance = 25;
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
        int year = 2083;
        if (year % 4 == 0) {
            if ((year % 100 != 0) && (year % 400 != 0)) {
                System.out.println("Високосный");
            }
            else System.out.println("Невисокосный");
        }
            if (year % 4 != 0) {
                System.out.println("Невисокосный");
            }
        }



    private static void task2() {
        char clientOS = 0;
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

