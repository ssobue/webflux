package dev.sobue.web.webflux;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * @author ssobue
 * @see WebfluxApplication
 */
@DisplayName("Application Running Test")
public class WebfluxApplicationTests {

  @Test
  @DisplayName("Test Loading ApplicationContext")
  public void contextLoads() {
    assertDoesNotThrow(() -> WebfluxApplication.main(new String[0]));
  }
}
