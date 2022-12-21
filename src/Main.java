import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2 ();
        task3 ();
        task4();

    }

    private static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
        }
    }

    private static void task3() {
        int[] arr = generateRandomArray();
        float sum = 0;
        float sumAverage = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[1];
           sumAverage = sum / arr.length;
        }
        {
            System.out.println("Средняя сумма за месяц составила " + sumAverage + " рублей");
        }
    }

    private static void task2() {
        int[] arr = generateRandomArray();
        int sumMin = 200_000;
        int sumMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sumMax) {
                sumMax = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]< sumMin) {
                sumMin = arr[i];
            }

        }
        System.out.println("Минимальная сумма трат за день составила " + sumMin + " рублей. Максимальная сумма трат за день составила " + sumMax + " рублей");
    }


        private static void task1 () {
            int[] arr = generateRandomArray();
            int sum = 0;
            for (int element: arr) {
                sum += arr[1];
            }
            {
                System.out.println("Сумма за месяц составила " + sum + " рублей");
            }
        }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
