package service;

import model.User;
import java.util.List;
import java.util.UUID;

public class AuthService {
    private List<User> users;
    private User currentUser;

    public AuthService(List<User> users) {
        this.users = users;
    }

    public boolean login(String username, String password) {
        for (User u : users) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                currentUser = u;
                System.out.println("Đăng nhập thành công!");
                return true;
            }
        }
        System.out.println("Sai tên đăng nhập hoặc mật khẩu!");
        return false;
    }

    public void register(String username, String password, String email, String phoneNumber) {
        for (User u : users) {
            if (u.getUsername().equals(username)) {
                System.out.println("Tên người dùng đã tồn tại!");
                return;
            }
        }
        String id = UUID.randomUUID().toString();
        User newUser = new User(id, username, password, email, phoneNumber);
        users.add(newUser);
        System.out.println("Đăng ký thành công!");
    }

    public void changePassword(String userId, String newPassword, String confirmNewPassword) {
        if (!newPassword.equals(confirmNewPassword)) {
            System.out.println("Mật khẩu xác nhận không khớp!");
            return;
        }

        for (User u : users) {
            if (u.getId().equals(userId)) {
                u.setPassword(newPassword);
                System.out.println("Đổi mật khẩu thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy người dùng!");
    }

    public User getCurrentUser() {
        return currentUser;
    }
}
