package Transport;


import java.util.*;

public abstract class Transport  <T extends Driver>  implements Compatible {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.getEngineSize(), getEngineSize()) == 0 && Objects.equals(getBrand(), transport.getBrand()) && Objects.equals(getModel(), transport.getModel()) && Objects.equals(getDriver(), transport.getDriver()) && Objects.equals(mechanicList, transport.mechanicList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getEngineSize(), getDriver(), mechanicList);
    }

    private String Brand;

    @Override
    public String toString() {
        return "Transport{" +
                "Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", engineSize=" + engineSize + '\'' +
                ", mechanic=" + mechanicList + '\'' +
                '}';
    }

    private String Model;
    private double engineSize;

    private T driver;

    private final List<Mechanic> mechanicList;


    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }


    public Transport(String brand, String model, double engineSize, T driver, List<Mechanic> mechanicList) {
        Brand = (brand == null || brand.length() == 0 ? "Default" : brand);
        Model = (model == null || brand.length() == 0 ? "Default" : model);
        this.engineSize = (engineSize <= 1 ? 1.7 : engineSize);
        setDriver(driver);
        this.mechanicList = mechanicList;
        }

    public  void showMechanics () {
    Map<Transport, List <Mechanic>> transportMap = new HashMap<>();
//    for (Mechanic ignored : mechanicList) {
        transportMap.put(this, mechanicList);
  //      System.out.println(Arrays.toString(transportMap.toString().toCharArray()));
        System.out.println(transportMap);
 //   }


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


    public void createMechanic (){
        ArrayList<Mechanic> mechanicList = new ArrayList<>();
        mechanicList.add(new Mechanic("Иван Иванов", "Данфосс"));
        mechanicList.add(new Mechanic("Петр петров", "Мерседес"));
        mechanicList.add(new Mechanic("Семен Семенов", "Вольво"));
        ArrayList<Mechanic> mechanicList2 = new ArrayList<>(mechanicList);
        System.out.println(mechanicList);

    }
    public boolean checkTransportNeedService() {
        try {
            passDiagnostic(); //проверяет что трансопрт имеет возможность проходить диагностику, должен быть переопределен в наследниках
        } catch (TransportTypeException e) {
            return false;
        }
        return true;
    }

    }


