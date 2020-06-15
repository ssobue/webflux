package dev.sobue.web.webflux;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;

/**
 * Implementation of Person Service.
 *
 * @author ssobue
 */
@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

  /**
   * Repository for {@link Person}.
   */
  private final PersonRepository repository;

  /**
   * {@inheritDoc}
   */
  @Override
  @Transactional(readOnly = true)
  public Flux<Person> get() {
    return repository.findAll();
  }
}
