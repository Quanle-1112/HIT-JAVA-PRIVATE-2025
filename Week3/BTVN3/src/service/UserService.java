package service;

import model.User;
import java.util.List;

public class UserService {
    private List<User> users;

    public UserService(List<User> users) {
        this.users = users;
    }

    public User getUserById(String userId) {
        for (User u : users) {
            if (u.getId().equals(userId)) {
                return u;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return users;
    }
}
