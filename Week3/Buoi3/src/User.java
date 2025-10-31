public class User {
    private int id;
    private String name;
    private double balance;

    public User() {
    }

    public User(int id, String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Nap xong. So tien: " + this.balance);
        } else {
            System.out.println("Nap that bai.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Rut that bai");
        } else if (amount > this.balance) {
            System.out.println("So du khong du.");
        } else {
            this.balance -= amount;
            System.out.println("Rut thanh cong. So tien: " + this.balance);
        }
    }

    public void chuyen(double amout) {

    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}