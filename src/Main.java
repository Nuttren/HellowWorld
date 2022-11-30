

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        

    }

    private static void task8() {
        int masha = 67760;
        int denis = 83690;
        int christina = 76230;
        int monthYear = 12;
        double indexationRate = 1.1;
        double indexedMasha = masha *indexationRate;
        double differenceMasha = indexedMasha * monthYear - masha*monthYear;
        System.out.println("Маша теперь получает " + indexedMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        double indexedDenis = denis * indexationRate;
        double differenceDenis = indexedDenis * monthYear - denis * monthYear;
        System.out.println("Денис теперь получает " + indexedDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        double indexedChristina = christina * indexationRate;
        double differenceChristina = indexedChristina * monthYear - christina * monthYear;
        System.out.println("Кристина теперь получает " + indexedChristina + " рублей. Годовой доход вырос на " + differenceChristina + " рублей");



    }

    private static void task7() {
        float weightLose1 = 250f;
        float weightLose2 = 500f;
        int extraWeight = 7000;
        float scenarioOne = extraWeight / weightLose1;
        float scenarioTwo = extraWeight / weightLose2;
        System.out.println("Чтобы похудеть на 7 килограмм спортсмену нужно " + scenarioOne + " дней");
        System.out.println("Чтобы похудеть на 7 килограмм спортсмену нужно " + scenarioTwo + " дней");
    }

    private static void task6() {
        byte bananas = 5;
        byte bananaWeight = 80;
        float bananatotalWeight = bananas * bananaWeight; // общий вес бананов в коктейле
        int milk = 2;
        int milkWeight = 105;
        float milktotalWeight = milk * milkWeight; // общий вес молока в коктейле
        int iceCream = 2;
        int icecreamWeight = 100;
        float icecreamtotalWeight = iceCream * icecreamWeight; // общий вес мороженного в коктейле
        int eggs = 4;
        int eggsWeight = 70;
        float eggstotalWeight = eggs * eggsWeight; // общий вес яиц в коктейле
        int grammsInKilo = 1000;
        float totalWeightGramms = bananatotalWeight + milktotalWeight + icecreamtotalWeight + eggstotalWeight;
        System.out.println("Общий вес коктейля " + totalWeightGramms + " грамм");
        totalWeightGramms = totalWeightGramms / grammsInKilo;
        System.out.println("Общий вес коктейля " + totalWeightGramms + " килограмм");

    }

    private static void task5() {
        byte totalJars = 120; // всего банок
        byte whiteJar = 2;
        byte brownJar = 4;
        int jarsOne = (totalJars / (whiteJar + brownJar)); // банок на один класс
        int classesTotal = totalJars / jarsOne; // всего классов
        int whiteTotal = whiteJar * classesTotal;
        int brownTotal = brownJar * classesTotal;
        System.out.println("В школе, где " + classesTotal + " классов, нужно " + whiteTotal + " банок белой краски и " + brownTotal + " банки коричневой краски");


    }

    private static void task4() {
        long bottlesMinute = 16/2;
        bottlesMinute = bottlesMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottlesMinute + " штук бутылок");
        long minutesDay = 24*60;
        bottlesMinute = bottlesMinute * minutesDay;
        System.out.println("За сутки машина произвела " + bottlesMinute + " штук бутылок");
        minutesDay = minutesDay * 3;
        bottlesMinute = bottlesMinute * minutesDay;
        System.out.println("За сутки машина произвела " + bottlesMinute + " штук бутылок");
        byte daysMonth = 30;
        minutesDay = minutesDay * daysMonth;
        bottlesMinute = bottlesMinute * minutesDay;
        System.out.println("За сутки машина произвела " + bottlesMinute + " штук бутылок");

    }

    private static void task3() {
        byte classOne = 23;
        byte classTwo = 27;
        byte classThree = 30;
        short listsNumber = 480;
        short totalLists = (byte) (listsNumber / (classOne + classTwo+ classThree));
        System.out.println("На каждого ученика рассчитано " + totalLists + " листов бумаги");
    }

    private static void task2() {
        float a = 27.12f;
        long b = 987678965549l; // 987 678 965 549 не влезает в эту переменную
        double c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte j = 67;

    }

    private static void task1() {
        byte a = 1;
        System.out.println("Значение переменной " + "a" + " с типом " + "byte" + " равно " + a);
        short b = 100;
        System.out.println("Значение переменной " + "b" + " с типом " + "short" + " равно " + b);
        int c = 1000;
        System.out.println("Значение переменной " + "c" + " с типом " + "int" + " равно " + c);
        long d = 10000;
        System.out.println("Значение переменной " + "d" + " с типом " + "long" + " равно " + d);
        float e = 10f;
        System.out.println("Значение переменной " + "e" + " с типом " + "char" + " равно " + e);
        double f = 50f;
        System.out.println("Значение переменной " + "f" + " с типом " + "double" + " равно " + f);
    }


}
