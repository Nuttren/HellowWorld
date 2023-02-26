package Hash;
import Transport.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

    ArrayList<CarsDrives> driverList = new ArrayList<CarsDrives>();

        driverList.add(new CarsDrives("Иван Иванов", true, 5));
        driverList.add(new CarsDrives("Иван Иванов", true, 5));
        driverList.add(new CarsDrives("Хрюн Моржов", true, 1));
        driverList.add(new CarsDrives("Петр Петров", false, 10));
        driverList.add(new CarsDrives("Максим Максимов", true, 1));
        driverList.add(new CarsDrives("Федор Федоров", false, 1));
        driverList.add(new CarsDrives("Хрюн Моржов", true, 1));
        System.out.println(Arrays.toString(driverList.toArray()));


        Set<CarsDrives> driverListSet = new HashSet<>();

        driverListSet.add(new CarsDrives("Иван Иванов", true, 5));
        driverListSet.add(new CarsDrives("Хрюн Моржов", true, 1));
        driverListSet.add(new CarsDrives("Иван Иванов", true, 5));
        driverListSet.add(new CarsDrives("Петр Петров", false, 10));
        driverListSet.add(new CarsDrives("Максим Максимов", true, 1));
        driverListSet.add(new CarsDrives("Федор Федоров", false, 1));
        driverListSet.add(new CarsDrives("Хрюн Моржов", true, 1));
        System.out.println(Arrays.toString(driverListSet.toArray()));

    }
}

