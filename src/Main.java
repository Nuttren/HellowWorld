public class Main {
    public static void main(String[] args)
    {
        var dog = 8.0;
        dog = dog + 4;
        dog = dog - 1.6;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 7639;
        paper = paper + 4;
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19.0;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 2;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println(boxer1 + boxer2);
        System.out.println(boxer2 - boxer1);

        var weightdifference = (boxer2 - boxer1);
                System.out.println("Первый боксер тяжелее на " + weightdifference + " кг!");

                var totalhours = 640;
                var workinghours = 8;
                var numberofworkers = totalhours / workinghours;
        System.out.println("Всего работников в компании - " + numberofworkers + " человек");

        numberofworkers = numberofworkers + 94;
        totalhours = workinghours * numberofworkers;
        System.out.println("Если в компании работает " + numberofworkers + " человек, то всего " + totalhours + " часов работы может быть поделено между сотрудниками");
    }
}