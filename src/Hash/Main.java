package Hash;
import Transport.*;

import java.util.*;

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


        driverListSet.add(new CarsDrives("Иван Иванов", false, 5));
        driverListSet.add(new CarsDrives("Хрюн Моржов", true, 1));
        driverListSet.add(new CarsDrives("Иван Иванов", true, 5));
        driverListSet.add(new CarsDrives("Петр Петров", false, 10));
        driverListSet.add(new CarsDrives("Максим Максимов", true, 1));
        driverListSet.add(new CarsDrives("Федор Федоров", false, 1));
        driverListSet.add(new CarsDrives("Хрюн Моржов", true, 1));
        //       System.out.println(Arrays.toString(driverListSet.toArray()));
        Iterator<CarsDrives> iterName = driverListSet.iterator();
        while (iterName.hasNext()) {
            System.out.println(iterName.next());
        }

    }
}
