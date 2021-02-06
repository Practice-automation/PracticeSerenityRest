package co.com.automation.service;

import co.com.automation.models.request.User;
import co.com.automation.models.response.Users;
import io.restassured.http.ContentType;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;

public final class UserService {

  private UserService() {}

  public static void createUser(User user) {
    SerenityRest.given()
        .log()
        .all()
        .contentType(ContentType.JSON)
        .auth()
        .oauth2(Serenity.sessionVariableCalled("user token"))
        .body(user)
        .when()
        .post("https://gorest.co.in/public-api/users")
        .then()
        .log()
        .all()
        .statusCode(200);
  }

  public static Users getUsers() {
    SerenityRest.given()
        .log()
        .all()
        .contentType(ContentType.JSON)
        .auth()
        .oauth2(Serenity.sessionVariableCalled("user token"))
        .when()
        .get("https://gorest.co.in/public-api/users")
        .then()
        .log()
        .all()
        .statusCode(200);
    return SerenityRest.lastResponse().as(Users.class);
  }
}
