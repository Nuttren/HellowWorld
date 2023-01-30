import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
                CarList carList = new CarList();
                carList.addCar("Lada", "Granta", 0, "Желтый", 0, "Россия");
                carList.addCar("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия");
                carList.addCar("BMW", "Z8", 3.0, "Черный", 2021, "Россия");
                carList.addCar("Kia", "Sportage 4-го поколения", 2.4, "Красный", 2018, "Южная Корея");
                carList.addCar("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");
                carList.printAllCars();
        }
}







