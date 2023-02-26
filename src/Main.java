import Transport.*;

import java.security.Key;
import java.util.*;

public class Main {
    public static void main(String[] args) throws TransportTypeException {
        for (int i = 1; i <= 4; i++) {
            CarsDrives carDriver = new CarsDrives(
                    "Водитель автомобиля №" + i,
                    true,
                    2 + i);
            TrucksDrives truckDriver = new TrucksDrives(
                    "Водитель грузовика №" + i,
                    true,
                    3 + i);
            BusesDrivers busDriver = new BusesDrivers(
                    "Водитель автобуса №" + i,
                    true,
                    3 + i);
            Cars car = new Cars(
                    "Car brand №" + i,
                    "Car moder №" + i,
                    1.6,
                    carDriver,
                    List.of(new Mechanic("Mechanic №"+i, "MechanicCompany №"+i)),
                    Cars.typeOfCar.SEDAN,
                    Type.CARS
            );
            Trucks truck = new Trucks(
                    "Truck brand №" + i,
                    "Truck model №" + i,
                    2,
                    truckDriver,
                    List.of(new Mechanic("Mechanic №"+i, "MechanicCompany №"+i)),
                    Trucks.loadСapacity.N3,
                    Type.TRUCKS
            );
            Buses bus = new Buses(
                    "Bus brand №" + i,
                    "Bus moder №" + i,
                    1.7,
                    busDriver,
                    List.of(new Mechanic("Mechanic №"+i, "MechanicCompany №"+i)),
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
            ArrayList<Transport> autoList = new ArrayList<>(List.of(car,truck,bus));
            System.out.println(autoList);
            showDriver(car);
            showMechanic(car);
            car.checkTransportNeedService();
            truck.checkTransportNeedService();
            bus.checkTransportNeedService();
            passMaintanance(car, truck);
            ServiceStation serviceStation = new ServiceStation();
            serviceStation.addVehicleToQueue(car);
            serviceStation.passMaintanance(car);


        }

    }


    public static void printInfo(Transport<?> transport) {
        System.out.println(transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
    }

    public static void showDriver(Transport<?> transport) {
        System.out.println("Автомобиль модели " + transport.getModel() + " управляется водителем " + transport.getDriver().getName());
    }

    public static void showMechanic(Transport<?> transport) {
        System.out.println(transport.getModel() + " обслуживается механиком " + Mechanic.getNameMechanic());
    }

    public static void check(ServiceStation serviceStation) {
        if (Type.CARS.getType() != null && Type.TRUCKS.getType() != null) {
  //          serviceStation.passMaintanance(car);
            System.out.println(serviceStation);


        }
    }

    public static void passMaintanance(Transport<?> car, Transport<?> truck) {
        Queue<Transport> queue = new LinkedList<>();
        queue.offer(car);
        queue.offer(truck);
        while (queue.size() > 0) {
            System.out.print(queue.remove() + " ");
        }
    }
}







