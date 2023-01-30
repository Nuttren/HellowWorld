import java.util.Arrays;

public class CarList {
    private static Car[] cars;
    private static int size;

    public CarList() {
        this.cars = new Car[20];
    }
    public static void addCar(String brand, String model, double engineVolume, String color, int year, String country) {
        Car newCar = new Car(brand, model, engineVolume, color, year, country);
        if (size >= cars.length) {
            System.out.println("Нельзя добавить автомобиль");
        }
        cars[size++] = newCar;
    }
    public void printAllCars() {
        for (int i = 0; i < size && cars[i] != null; i++) {
        }
        System.out.println(Arrays.toString(cars));
    }
}