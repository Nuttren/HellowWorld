package Transport;

public class Buses extends Transport <BusesDrivers> {


    public Buses(String brand, String model, double engineSize, BusesDrivers driver, numberOfSeats numberOfSeats, Type type) {
        super(brand, model, engineSize, driver);
        getType();
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


    public enum numberOfSeats {
        VERYSMALL(0, 10),
        SMALL(0, 25),
        MIDDLE(25, 50),
        LARGE(50, 80),
        VERYLARGE(80, 120);


        @Override
        public String toString() {
            if (minSeats >= 0 && maxSeats <= 10) {
                return "Максимальная вместимость: " +
                        +maxSeats +
                        ' ';
            }
            if (minSeats >= 0 && maxSeats <= 25) {
                return "Максимальная вместимость: " +
                        +maxSeats +
                        ' ';
            }
            if (minSeats > 25) {
                return "Вместимость: {" +
                        minSeats + '\'' +
                        " - " + '\'' +
                        maxSeats + '\'' +
                        ' ';
            }
            return null;
        }

        private int minSeats;
        private int maxSeats;

        numberOfSeats(int minSeats, int maxSeats) {
            this.minSeats = minSeats;
            this.maxSeats = maxSeats;

        }

        public static void main(String[] args) {
            System.out.println(numberOfSeats.VERYSMALL);
        }
    }
    @Override
    void getType() {

    }

    @Override
    public void printType() {
        if (Type.BUSES.getType() != null)
        System.out.println(Type.BUSES.getType());
        else System.out.println("Тип транспортного средства не указан");
    }

    @Override
    public void passDiagnostic() throws TransportTypeException {
        if (Type.BUSES == Type.BUSES) {
            throw new TransportTypeException(Type.BUSES.getType() + " не должен проходить диагностику");
        }

    }
}


