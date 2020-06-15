package dev.sobue.web.webflux;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * Repository for {@link Person}.
 *
 * @author ssobue
 * @see ReactiveCrudRepository
 */
public interface PersonRepository extends ReactiveCrudRepository<Person, Long> {

}
