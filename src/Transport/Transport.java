package Transport;


import java.util.AbstractList;
import java.util.ArrayList;

public abstract class Transport  <T extends Driver>  implements Compatible {

    private String Brand;

    @Override
    public String toString() {
        return "Transport{" +
                "Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", engineSize=" + engineSize + '\'' +
                '}';
    }

    private String Model;
    private double engineSize;

    private T driver;

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    ArrayList<Mechanic> mechanic;

    public Transport(String brand, String model, double engineSize, T driver, ArrayList<Mechanic> mechanic) {
        Brand = (brand == null || brand.length() == 0 ? "Default" : brand);
        Model = (model == null || brand.length() == 0 ? "Default" : model);
        this.engineSize = (engineSize <= 1 ? 1.7 : engineSize);
        setDriver(driver);
        this.mechanic = mechanic;
    }




    // метод начать двежение
    public void startMove() {
    }

    // метод закончить движение
    public void stopMove() {
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    abstract void getType();

    public abstract void printType();

    public abstract void passDiagnostic() throws TransportTypeException;

    public static void main(String[] args) {
        ArrayList<Mechanic> mechanicList = new ArrayList<>();
        mechanicList.add(new Mechanic("Иван Иванов", "Данфосс"));
        mechanicList.add(new Mechanic("Петр петров", "Мерседес"));
        mechanicList.add(new Mechanic("Семен Семенов", "Вольво"));
    }
    }


