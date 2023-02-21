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

    public Transport(String brand, String model, double engineSize, T driver) {
        Brand = (brand == null || brand.length() == 0 ? "Default" : brand);
        Model = (model == null || brand.length() == 0 ? "Default" : model);
        this.engineSize = (engineSize <= 1 ? 1.7 : engineSize);
        setDriver(driver);

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


    public void mechanicList() {
        for (int i = 1; i <= 4; i++) {
            Mechanic mechanic = new Mechanic(
                    "Механик №" + i,
                    "Компания №" + i);
            ArrayList<Mechanic> mechanicList = new ArrayList<>();
            mechanicList.add(mechanic);
            System.out.println(mechanicList);
        }

    }

    }


