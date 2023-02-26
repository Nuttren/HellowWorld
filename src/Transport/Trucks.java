package Transport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Trucks extends Transport <TrucksDrives> {


    public Trucks(String brand, String model, double engineSize, TrucksDrives driver, List<Mechanic> mechanicList, loadСapacity loadСapacity, Type type) {
        super(brand, model, engineSize, driver,mechanicList);
        getType();
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у грузовика");

    }

    @Override
    public void theBestCircleTime() {
        int minBound = 100;
        int maxBound = 150;
        int bestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для грузовика " + bestTime);
    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Наибольшая скорость для грузовика " + maxSpeed);
    }


    public enum loadСapacity {
        N1(0.0F, 3.5F),
        N2(3.5F, 12.0F),
        N3(12.0F, 0.0F);


        @Override
        public String toString() {
            if (minLoad != 0 && maxLoad != 0) {
                return "loadСapacity{" +
                        "Грузоподъемность: от " + minLoad + '\'' +
                        "до " + maxLoad + '\'' +
                        '}';
            }
            if (minLoad == 0 && maxLoad != 0) {
                return "loadСapacity{" +
                        "Максимальная грузоподъемность: " + maxLoad + '\'' +
                        '}';
            }
            if (minLoad != 0 && maxLoad == 0) {
                return "loadСapacity{" +
                        "Минимальная грузоподъемность: " + minLoad + '\'' +
                        '}';
            } else
                return "loadСapacity{" +
                        "Грузоподъемность неизвестна" + '\'' +
                        '}';
        }

        private float minLoad;

        private float maxLoad;

        loadСapacity(Float minLoad, Float maxLoad) {
            this.minLoad = minLoad;
            this.maxLoad = maxLoad;

        }
    }

    //    public void printLoad () {
    //       System.out.println(LoadСapacity.N2);
    //   }
    public static void main(String[] args) {
        System.out.println(loadСapacity.N1);
    }
    @Override
    void getType() {

    }

    @Override
    public void printType() {
        if (Type.TRUCKS.getType() != null)
        System.out.println(Type.TRUCKS.getType());
        else System.out.println("Тип транспортного средства не указан");
    }

    @Override
    public void passDiagnostic()  {
        System.out.println(Type.TRUCKS.getType() + " должен пройти диагностику диагностику");

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