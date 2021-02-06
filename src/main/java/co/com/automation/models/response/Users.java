package co.com.automation.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Users {

  @JsonProperty("code")
  private Integer code;

  @JsonProperty("meta")
  private Meta meta;

  @JsonProperty("data")
  private List<Data> datas;
}
