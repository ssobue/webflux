package dev.sobue.web.webflux;

import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.r2dbc.connectionfactory.init.CompositeDatabasePopulator;
import org.springframework.data.r2dbc.connectionfactory.init.ConnectionFactoryInitializer;
import org.springframework.data.r2dbc.connectionfactory.init.ResourceDatabasePopulator;

/**
 * Application Configuration.
 *
 * @author ssobue
 */
@Configuration
public class WebfluxConfiguration {

  /**
   * ConnectionFactoryInitializer for data initialization.
   *
   * @param connectionFactory r2dbc's connection factory
   * @return Connection Factory Initializer
   */
  @Bean
  public ConnectionFactoryInitializer initializer(ConnectionFactory connectionFactory) {
    ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
    initializer.setConnectionFactory(connectionFactory);

    CompositeDatabasePopulator compositeDatabasePopulator = new CompositeDatabasePopulator();
    compositeDatabasePopulator.addPopulators(
        new ResourceDatabasePopulator(new ClassPathResource("/schema.sql"))
    );
    compositeDatabasePopulator.addPopulators(
        new ResourceDatabasePopulator(new ClassPathResource("/data.sql"))
    );

    initializer.setDatabasePopulator(compositeDatabasePopulator);

    return initializer;
  }
}
