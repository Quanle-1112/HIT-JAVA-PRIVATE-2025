import java.util.ArrayList;

public class Manager extends Employee {
    private ArrayList<SaleStaff> saleStaffs = new ArrayList<>();
    private ArrayList<Technician> technicians = new ArrayList<>();

    public Manager() {}

    public Manager(int id, String name, String country, double salary, ArrayList saleStaffs, ArrayList technicians ) {
        super(id, name, country, salary);
        this.saleStaffs=saleStaffs;
        this.technicians=technicians;
    }

    public void setTechnicians(ArrayList<Technician> technicians) {
        this.technicians = technicians;
    }

    public void setSaleStaffs(ArrayList<SaleStaff> saleStaffs) {
        this.saleStaffs = saleStaffs;
    }

    public ArrayList<SaleStaff> getSaleStaffs() {
        return saleStaffs;
    }

    public ArrayList<Technician> getTechnicians() {
        return technicians;
    }

    public void addSaleStaff(SaleStaff s) {
        saleStaffs.add(s);
    }

    public void addTechnician(Technician t) {
        technicians.add(t);
    }

    public SaleStaff getSaleStaffById(int saleStaffId) {
        for (SaleStaff s : saleStaffs) {
            if (s.getId() == saleStaffId) {
                return s;
            }
        }
        return null;
    }

    public Technician getTechnicianById(int technicianId) {
        for (Technician t : technicians) {
            if (t.getId() == technicianId) {
                return t;
            }
        }
        return null;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing " + saleStaffs.size() + " sale staff and " + technicians.size() + " technicians.");
    }
}
