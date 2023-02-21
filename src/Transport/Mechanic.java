package Transport;

public class Mechanic {
     private static String nameMechanic;
     private String companyMechanic;

    @Override
    public String toString() {
        return "Mechanic{" +
                "nameMechanic='" + nameMechanic + '\'' +
                ", companyMechanic='" + companyMechanic + '\'' +
                '}';
    }

    public Mechanic(String nameMechanic, String companyMechanic) {
        this.nameMechanic = nameMechanic;
        this.companyMechanic = companyMechanic;
    }

    public void maintenanceWork() {
        System.out.println("Провести техобслуживание");
    }
    public void repairVehicle(){
        System.out.println("Починить траспортное средство");
    }


    public static String getNameMechanic() {
        return nameMechanic;
    }

    public void setNameMechanic(String nameMechanic) {
        this.nameMechanic = nameMechanic;
    }

    public String getCompanyMechanic() {
        return companyMechanic;
    }

    public void setCompanyMechanic(String companyMechanic) {
        this.companyMechanic = companyMechanic;
    }
}
