package Transport;

public class Buses extends Transport <BusesDrivers>{


    public Buses(String brand, String model, double engineSize, BusesDrivers driver) {
        super(brand, model, engineSize, driver);
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса");

    }

    @Override
    public void theBestCircleTime() {
        int minBound = 100;
        int maxBound = 150;
        int bestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для автобуса " + bestTime);
    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Наибольшая скорость для автобуса " + maxSpeed);
    }
}
