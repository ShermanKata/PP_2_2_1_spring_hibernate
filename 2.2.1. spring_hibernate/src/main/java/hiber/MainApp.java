package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      User user1 = new User("User1", "Lastname1", "user1@mail.ru");
      Car car1 = new Car("model1", 101);
      user1.setCar(car1);
      userService.add(user1);

      User user2 = new User("User2", "Lastname2", "user2@mail.ru");
      Car car2 = new Car("model2", 202);
      user2.setCar(car2);
      userService.add(user2);

      User user3 = new User("User3", "Lastname3", "user3@mail.ru");
      Car car3 = new Car("model3", 303);
      user3.setCar(car3);
      userService.add(user3);

      User user4 = new User("User4", "Lastname4", "user4@mail.ru");
      Car car4 = new Car("model4", 404);
      user4.setCar(car4);
      userService.add(user4);

      List<User> users = userService.listUsers();
      users.forEach(System.out::println);

      System.out.println();

      System.out.println(userService.getUser("model3", 303));

      context.close();
   }
}
