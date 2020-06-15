package dev.sobue.web.webflux;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

/**
 * Person Entity.
 *
 * @author ssobue
 */
@Data
@ToString
public class Person {

  /**
   * ID.
   */
  @Id
  private Long id;

  /**
   * Name.
   */
  private String name;

  /**
   * Created DateTime.
   */
  @CreatedDate
  private LocalDateTime created;

  /**
   * Modified DateTime.
   */
  @LastModifiedDate
  private LocalDateTime modified;
}
