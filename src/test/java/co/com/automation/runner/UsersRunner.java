package co.com.automation.runner;

import co.com.automation.models.request.User;
import co.com.automation.models.response.Users;
import co.com.automation.service.UserService;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class UsersRunner {

  @Before
  public void login() {
    String token = "240ba82d9f38f525ed74a6dbd530e9e9d866c34021c7c4c594986352f7e83aaa";
    Serenity.setSessionVariable("user token").to(token);
  }

  @Test
  public void createUsers() {
    User user1 =

        User.builder().name("Juan").email("juan@gmail.com").gender("M").status("Active").build();
    User user2 =

        User.builder().name("Pedro").email("pedro@gmail.com").gender("M").status("Active").build();
    User user3 =

        User.builder().name("Luis").email("luis@gmail.com").gender("M").status("Inactive").build();
    UserService.createUser(user1);
    UserService.createUser(user2);
    UserService.createUser(user3);
  }

  @Test
  public void getUsers() {
    Users users = UserService.getUsers();
    users
        .getDatas()
        .stream()
        .filter(x -> x.getName().startsWith("B"))
        .forEach(
            x -> {
              System.out.println("Id: " + x.getId() + " Nombre " + x.getName());
            });
  }
}
