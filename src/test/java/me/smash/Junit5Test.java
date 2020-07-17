package me.smash;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Junit5Test {

  @Test
  public void sampleTest() {
    assertThat(new YetAnotherClass().add(1, 2)).isEqualTo(3);
  }

}
