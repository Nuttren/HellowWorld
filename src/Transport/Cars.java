package Transport;

public class Cars extends Transport <CarsDrives>{

    public Cars(String brand, String model, double engineSize, CarsDrives driver, typeOfCar typeOfCar, Type type) {
        super(brand, model, engineSize, driver);
        getType();
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


    public enum typeOfCar {
        SEDAN ("Седан"),
        HETCHBACK ("Хетчбэк"),
        COUPE ("Купе"),
        WAGON ("Универсал"),
        SUV ("Внедорожник"),
        CROSSOVER ("Кроссовер"),
        PICKUP ("Пикап"),
        VAN ("Фургон"),
        MINIVAN ("Минивен"),
        ;


        public String getTypeOfCar() {
            return typeOfCar;
        }

        @Override
        public String toString() {
            return "Type{" +
                    "Тип кузова: " + typeOfCar + '\'' +
                    '}';
        }

        private String typeOfCar;


        typeOfCar(String typeOfCar) {

            this.typeOfCar = typeOfCar;
        }
        public String getCarType() {
            return typeOfCar;
        }

        public void setType(String type) {
            this.typeOfCar = typeOfCar;
        }
    }
    @Override
    void getType() {

    }

    @Override
    public void printType() {
        if (Type.CARS.getType() != null)
        System.out.println(Type.CARS.getType());
        else System.out.println("Тип транспортного средства не указан");
    }


}

