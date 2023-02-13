import Transport.*;

import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
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
                                Type.Cars
                        );
                        Trucks truck = new Trucks(
                                "Truck brand №" + i,
                                "Truck model №" + i,
                                2,
                                truckDriver,
                                Trucks.loadСapacity.N3,
                                Type.Trucks
                        );
                        Buses bus = new Buses(
                                "Bus brand №" + i,
                                "Bus moder №" + i,
                                1.7,
                                busDriver,
                                Buses.numberOfSeats.LARGE,
                                Type.Buses

                        );
                       System.out.println(car);
                        System.out.println(truck);
                        System.out.println(bus);
                        printInfo(car);
                        printInfo(truck);
                        printInfo(bus);
                        car.printType(Type.Cars);
                        truck.printType(Type.Trucks);
                        bus.printType(Type.Buses);
                }

        }
        public static void printInfo (Transport <?> transport) {
                System.out.println(transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
        }

}







