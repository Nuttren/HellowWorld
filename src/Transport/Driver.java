package Transport;

import java.util.Objects;

public abstract class Driver {
    @Override
    public String toString() {
        return "Driver{" +
                "Имя:" + name + '\'' +
                ", Наличие прав:" + drivingLicences +
                ", Стаж:" + yearOfExperience +
                '}';
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver driver = (Driver) o;
        return isDrivingLicences() == driver.isDrivingLicences() && getYearOfExperience() == driver.getYearOfExperience() && getName().equals(driver.getName());
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
