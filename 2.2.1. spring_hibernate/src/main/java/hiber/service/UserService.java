package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    User getUser(String model, int series);

    List<User> getListOfUsers();
}
