package Transport;

public class TrucksDrives extends Driver{


    public TrucksDrives(String name, boolean drivingLicences, int yearOfExperience) {
        super(name, drivingLicences, yearOfExperience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель грузовика " +getName() + " начал движение");

    }

    @Override
    public void stopMove() {
        System.out.println("Водитель грузовика " +getName() + " закончил движение");
    }

    @Override
    public void fuelVehicle() {
        System.out.println("Водитель грузовика " +getName() + " заправляет тс");
    }

}
