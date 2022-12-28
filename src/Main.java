import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    private static void deliveryTime(int deliveryDistance) {
        int standardDeliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + standardDeliveryTime);
        }
        if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (standardDeliveryTime + 1));
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (standardDeliveryTime + 2));
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
    }


    private static void task3() {
        int deliveryDistance = 95;
        deliveryTime(deliveryDistance);
    }

    private static void checkDevice(int clientDeviceYear, int system) {
        if (clientDeviceYear < 2015 && system == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear >= 2015 && system == 0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear < 2015 && system == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientDeviceYear >= 2015 && system == 1) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
    }

    private static void task2() {
        int clientDeviceYear = 2014;
        int system = 1;
        checkDevice(clientDeviceYear, system);

    }

    public static void checkYear(int year) {
        if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }

    private static void task1() {
        int year = 100;
        checkYear(year);
    }
}







