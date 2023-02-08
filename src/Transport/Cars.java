package Transport;

public class Cars extends Transport <CarsDrives>{


    public Cars(String brand, String model, double engineSize, CarsDrives driver) {
        super(brand, model, engineSize, driver);
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автомобиля");

    }

    @Override
    public void theBestCircleTime() {
        int minBound = 100;
        int maxBound = 150;
        int bestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для автомобиля " + bestTime);
    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Наибольшая скорость для автомобиля " + maxSpeed);
    }
}

