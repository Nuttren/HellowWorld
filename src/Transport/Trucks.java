package Transport;

public class Trucks extends Transport <TrucksDrives>{


    public Trucks(String brand, String model, double engineSize, TrucksDrives driver) {
        super(brand, model, engineSize, driver);
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у грузовика");

    }

    @Override
    public void theBestCircleTime() {
        int minBound = 100;
        int maxBound = 150;
        int bestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для грузовика " + bestTime);
    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Наибольшая скорость для грузовика " + maxSpeed);
    }
}
