package Transport;

public class BusesDrivers extends Driver{
    public String drivingLicencesBuses = "D";
    public BusesDrivers(String name, boolean drivingLicences, int yearOfExperience) {
        super(name, drivingLicences, yearOfExperience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель автобуса " +getName() + " начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println("Водитель автобуса " +getName() + " закончил движение");
    }

    @Override
    public void fuelVehicle() {
        System.out.println("Водитель автобуса " +getName() + " заправляет тс");
    }

}
