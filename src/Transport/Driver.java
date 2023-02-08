package Transport;

public abstract class Driver {

    private String name;
    private boolean drivingLicences;
    private int yearOfExperience;


    public Driver(String name, boolean drivingLicences, int yearOfExperience) {
        this.name = (name == null || name.length() == 0 ? "Иван Иванов" : name);
        this.drivingLicences = false;
        this.yearOfExperience = (yearOfExperience < 0 ? 0 : yearOfExperience);

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDrivingLicences() {
        return drivingLicences;
    }

    public void setDrivingLicences(boolean drivingLicences) {
        this.drivingLicences = drivingLicences;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }


    public abstract void startMove ();
    public abstract void stopMove ();
    public abstract void fuelVehicle ();

}
