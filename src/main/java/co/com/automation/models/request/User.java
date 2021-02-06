package co.com.automation.models.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class User {

  private String name;
  private String gender;
  private String email;
  private String status;
}
