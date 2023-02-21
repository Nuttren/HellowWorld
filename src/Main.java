import Transport.*;

import java.security.Key;
import java.util.*;

public class Main {
        public static void main(String[] args) throws TransportTypeException {
            for (int i = 1; i<=4; i++) {
                CarsDrives carDriver = new CarsDrives(
                        "Водитель автомобиля №"+i,
                        true,
                        2+i );
                TrucksDrives truckDriver = new TrucksDrives(
                        "Водитель грузовика №"+i,
                        true,
                        3+i );
                BusesDrivers busDriver = new BusesDrivers(
                        "Водитель автобуса №"+i,
                        true,
                        3+i );
                Cars car = new Cars(
                        "Car brand №" + i,
                        "Car moder №" + i,
                        1.6,
                        carDriver,
                        Cars.typeOfCar.SEDAN,
                        Type.CARS
                );
                Trucks truck = new Trucks(
                        "Truck brand №" + i,
                        "Truck model №" + i,
                        2,
                        truckDriver,
                        Trucks.loadСapacity.N3,
                        Type.TRUCKS
                );
                Buses bus = new Buses(
                        "Bus brand №" + i,
                        "Bus moder №" + i,
                        1.7,
                        busDriver,
                        Buses.numberOfSeats.LARGE,
                        Type.BUSES

                );
//                       System.out.println(car);
//                        System.out.println(truck);
//                        System.out.println(bus);
//                       printInfo(car);
//                        printInfo(truck);
//                       printInfo(bus);
//                       car.printType();
//                        truck.printType();
//                        bus.printType();
//                       car.passDiagnostic();
//                       bus.passDiagnostic();
//                      truck.passDiagnostic();
                ArrayList<Transport> autoList = new ArrayList<>();
                autoList.add(car);
                autoList.add(truck);
                autoList.add(bus);
                System.out.println(autoList);
                showDriver(car);
                showMechanic(car);
                car.checkTransportNeedService();
                truck.checkTransportNeedService();
                bus.checkTransportNeedService();

                }
            }


        public static void printInfo (Transport <?> transport) {
                System.out.println(transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
        }
         public static void showDriver (Transport <?> transport) {
             System.out.println("Автомобиль модели " + transport.getModel() + " управляется водителем " + transport.getDriver().getName());
        }
        public static void showMechanic (Transport <?> transport) {
            System.out.println(Mechanic.getNameMechanic() + " является механиком " + transport.getModel());
        }
        public static void check (ServiceStation serviceStation) {
        if (Type.CARS.getType() != null && Type.TRUCKS.getType() != null) {
            //         serviceStation.passMaintanance();
        }
    }
}







