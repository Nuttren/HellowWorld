package Transport;

public abstract class Transport <T extends Driver> implements Compatible{

    private String Brand;

    @Override
    public String toString() {
        return "Transport{" +
                "Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    private String Model;
    private double engineVolume;

    private T driver;

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public Transport(String brand, String model, double engineSize, T driver) {
        Brand = (brand == null || brand.length() == 0 ? "Default" : brand);;
        Model = (model == null || brand.length() == 0 ? "Default" : model);;
        this.engineVolume = (engineVolume <= 1 ? 1.7 : engineVolume);
        setDriver(driver);
    }


    // метод начать двежение
    public void startMove () {
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

    public double getEngineVolume() {
        return engineVolume;
    }
    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }



}
