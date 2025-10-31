public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Quan Le",10000);
        System.out.println("Thong tin user 1: " + user1.toString());

        user1.deposit(1000000);
        user1.withdraw(200000);
        user1.withdraw(900000);

        System.out.println("------------------------------------");

        User user2 = new User(102, "The Anh", 500000);
        System.out.println("Thong tin user 2: " + user2.toString());

        user2.setName("Hoang");
        System.out.println("Thong tin user 2: " + user2.getName());
        user2.withdraw(150000);

        System.out.println("Thong tin user 2: " + user2.toString());
        User user3 = new User(103, "Luong", 100000000);
    }
}