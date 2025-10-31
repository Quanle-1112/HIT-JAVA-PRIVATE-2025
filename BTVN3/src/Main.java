import model.User;
import service.AuthService;
import service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        // Tạo sẵn 5 user mẫu
        users.add(new User("1", "haki", "123", "haki@gmail.com", "0123456789"));
        users.add(new User("2", "kayn", "123", "kayn@gmail.com", "0987654321"));
        users.add(new User("3", "boss", "123", "boss@gmail.com", "0111111111"));
        users.add(new User("4", "zero", "123", "zero@gmail.com", "0222222222"));
        users.add(new User("5", "zen", "123", "zen@gmail.com", "0333333333"));

        AuthService authService = new AuthService(users);
        UserService userService = new UserService(users);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu Auth ---");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Chọn: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Username: ");
                    String username = sc.nextLine();
                    System.out.print("Password: ");
                    String password = sc.nextLine();
                    if (authService.login(username, password)) {
                        userMenu(authService, userService, sc);
                    }
                }
                case 2 -> {
                    System.out.print("Username: ");
                    String username = sc.nextLine();
                    System.out.print("Password: ");
                    String password = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();
                    authService.register(username, password, email, phone);
                }
                case 3 -> {
                    System.out.println("👋 Thoát chương trình!");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private static void userMenu(AuthService authService, UserService userService, Scanner sc) {
        while (true) {
            System.out.println("\n--- Menu User ---");
            System.out.println("1. Get user by id");
            System.out.println("2. Get all users");
            System.out.println("3. Change password");
            System.out.println("4. Logout");
            System.out.print("Chọn: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.print("Nhập ID người dùng: ");
                    String id = sc.nextLine();
                    var user = userService.getUserById(id);
                    System.out.println(user != null ? user : "Không tìm thấy!");
                }
                case 2 -> {
                    System.out.println("--- Danh sách người dùng ---");
                    for (User u : userService.getAllUsers()) {
                        System.out.println(u);
                    }
                }
                case 3 -> {
                    System.out.print("Nhập mật khẩu mới: ");
                    String newPass = sc.nextLine();
                    System.out.print("Nhập lại mật khẩu: ");
                    String confirm = sc.nextLine();
                    authService.changePassword(authService.getCurrentUser().getId(), newPass, confirm);
                }
                case 4 -> {
                    System.out.println("Đăng xuất thành công!");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
