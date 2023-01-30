import java.util.Arrays;

public class Car {
    private String brand;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }

    private String model;
    private double engineVolume;

    private String color;
    private int year;
    private String country;


    public Car (String brand, String model, double engineVolume, String color, int year, String country) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        if (brand == null || brand.length() == 0) {
            brand = "Default";
        }
        if (model == null || model.length() == 0) {
            model = "Default";
        }
        if (country == null || country.length() ==0) {
            country = "Default";
        }
        if (color == null || color.length() ==0) {
            color = "Белый";
        }
        if (year <= 0) {
            year = 2000;
        }
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

}
