package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
   void addUser(User user);

   User getUser(String model, int series);

   List<User> getListOfUsers();
}
