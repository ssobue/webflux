package dev.sobue.web.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Application Class of Spring Boot.
 *
 * @author ssobue
 */
@SpringBootApplication
public class WebfluxApplication {

  /**
   * Main Method.
   *
   * @param args Command Line Arguments.
   */
  public static void main(String[] args) {
    SpringApplication.run(WebfluxApplication.class, args);
  }
}
