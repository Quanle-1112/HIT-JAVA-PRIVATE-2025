public class Main {
    public static void main(String[] args) {
        Manager manager = getManager();

        SaleStaff foundSale = manager.getSaleStaffById(2);
        if (foundSale != null) {
            System.out.println("Found SaleStaff: " + foundSale.getName());
            foundSale.work();
        }

        Technician foundTech = manager.getTechnicianById(4);
        if (foundTech != null) {
            System.out.println("Found Technician: " + foundTech.getName());
            foundTech.work();
        }
    }

    private static Manager getManager() {
        Manager manager = new Manager();

        SaleStaff s1 = new SaleStaff(1, "Quan", "Vietnam", 800.0, 50);
        SaleStaff s2 = new SaleStaff(2, "Ha", "Vietnam", 900.0, 65);
        manager.addSaleStaff(s1);
        manager.addSaleStaff(s2);

        Technician t1 = new Technician(3, "Hung", "Vietnam", 1000.0, "Networking");
        Technician t2 = new Technician(4, "Tan", "Vietnam", 950.0, "Hardware");
        manager.addTechnician(t1);
        manager.addTechnician(t2);
        return manager;
    }
}
