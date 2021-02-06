package co.com.automation.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Meta {

  @JsonProperty("pagination")
  private Pagination pagination;
}
