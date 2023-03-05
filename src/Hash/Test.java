package Hash;

import Transport.CarsDrives;

import java.util.ArrayList;

class CarDriverInfo {
    void testCarDrivers (ArrayList<CarsDrives> al, checkCarDriver sc){
        for (CarsDrives s: al) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }

}
public class Test {
    public static void main(String[] args) {
        ArrayList<CarsDrives> driverList = new ArrayList<CarsDrives>();

        driverList.add(new CarsDrives("Иван Иванов", true, 5));
        driverList.add(new CarsDrives("Иван Иванов", true, 5));
        driverList.add(new CarsDrives("Хрюн Моржов", true, 1));
        driverList.add(new CarsDrives("Петр Петров", false, 10));
        driverList.add(new CarsDrives("Максим Максимов", true, 1));
        driverList.add(new CarsDrives("Федор Федоров", false, 1));
        driverList.add(new CarsDrives("Хрюн Моржов", true, 1));

        CarDriverInfo info = new CarDriverInfo();
        info.testCarDrivers(driverList, new checkCarDriver() {
            @Override
            public boolean check(CarsDrives s) {
                return s.getYearOfExperience()>5;
            }
        });
        System.out.println("_______________________________________________");
        info.testCarDrivers(driverList, (CarsDrives s) -> s.getYearOfExperience()>5);
    }
}

interface checkCarDriver {
    boolean check (CarsDrives s);
}