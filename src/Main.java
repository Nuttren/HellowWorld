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
        int one = 10;
        int two =5;
        int tree = 3;
        if (one>two && one>tree) {
            System.out.println("Число " + one +" самое большое");
        }
        else if  (two>one && two>tree) {
        System.out.println("Число " + two +" самое большое");
        }
        else {System.out.println("Число " + tree +" самое большое");
        }

    }

    private static void task6() {
        int passengers = 70;
        if (passengers<60) {
            System.out.println("Есть сидяцие места");
        }
        else if  (passengers>=60 && passengers<100) {
            System.out.println("Есть только стоячие места");
        }
        else {
            System.out.println("Мест нет");
        }


    }

    private static void task5() {
        int age=10;
        boolean isAdultAvailible=false;

        if (age<=5) {
            System.out.println("Нельзя кататься на аттракционе");
        }
        else if (age>5 && age<14 && isAdultAvailible) {
            System.out.println("Можно кататься в сопровождении взрослого");
        }
        else if (age>=14) {
            System.out.println("Можно кататься на аттракционе");
        }
        else {
            System.out.println("Нельзя кататься на аттракционе");
        }

    }


    private static void task4() {
        int age = 25;
        if (age>=2 && age<=6) {
            System.out.println("Если возраст человека равен " +age + ",то ему нужно ходить в детский сад");
        }
        else if (age>=7 && age<=18) {
            System.out.println("Если возраст человека равен " +age + ",то ему нужно ходить в школу");
        }
        else if  (age>18 && age<24) {
            System.out.println("Если возраст человека равен " +age + ",то его место у университете");
        }
        else if (age>=24) {
            System.out.println("Если возраст человека равен " +age + ",то ему пора ходить на работу");
        }
        else  {
            System.out.println("Если возраст человека равен " +age + ",то ему нужно сидеть дома");
        }

    }

    private static void task3() {
        int speed = 61;
        if (speed >=60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
            else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        }


    private static void task2() {
        int temperature = 4;
        if (temperature >=5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        else  {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        }
    }

    private static void task1() {
        int age = 20;
        if (age >=18) {
        System.out.println("Если возраст челока равен  " + age + " он совершеннолетний");}
        else {
            System.out.println("Если возраст челока равен  " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }

    }


}
