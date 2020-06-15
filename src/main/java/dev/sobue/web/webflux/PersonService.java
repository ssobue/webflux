package dev.sobue.web.webflux;

import reactor.core.publisher.Flux;

/**
 * Interface of Person Service.
 *
 * @author ssobue
 */
public interface PersonService {

  /**
   * Get All Person.
   *
   * @return people
   */
  Flux<Person> get();
}
