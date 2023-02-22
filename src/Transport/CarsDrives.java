package Transport;

import java.util.Objects;

public class CarsDrives extends Driver{


    public CarsDrives(String name, boolean drivingLicences, int yearOfExperience) {
        super(name, drivingLicences, yearOfExperience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель автомобиля " +getName() + " начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println("Водитель автомобиля " +getName() + " закончил движение");
    }

    @Override
    public void fuelVehicle() {
        System.out.println("Водитель автомобиля " +getName() + " заправляет тс");
    }




}
