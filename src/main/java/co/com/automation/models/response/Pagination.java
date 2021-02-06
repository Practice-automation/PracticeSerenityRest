package co.com.automation.models.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Pagination {

  private Integer total;
  private Integer pages;
  private Integer page;
  private Integer limit;
}
