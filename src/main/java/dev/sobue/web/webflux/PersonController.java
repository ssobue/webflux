package dev.sobue.web.webflux;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * Person API Controller.
 *
 * @author ssobue
 */
@RequestMapping("/api/person")
@RestController
@RequiredArgsConstructor
public class PersonController {

  /**
   * Person Service.
   */
  private final PersonService service;

  /**
   * Get All Person.
   *
   * @return people
   */
  @GetMapping
  public Flux<Person> get() {
    return service.get();
  }
}
