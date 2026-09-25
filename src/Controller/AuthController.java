package Controller;

import java.util.*;
import Model.User;

public class AuthController {

    private List<User> users;

    public AuthController() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User login(int userId, String pass) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserId() == userId &&
                users.get(i).getPass().equals(pass)) {
                return users.get(i);
            }
        }
        return null;
    }
}