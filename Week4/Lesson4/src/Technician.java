public class Technician extends Employee {
    private String techSkill;

    public Technician() {
    }

    public Technician(int id, String name, String country, double salary, String techSkill) {
        super(id, name, country, salary);
        this.techSkill = techSkill;
    }

    public String getTechSkill() {
        return techSkill;
    }

    public void setTechSkill(String techSkill) {
        this.techSkill = techSkill;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is working with skill: " + techSkill);
    }
}
