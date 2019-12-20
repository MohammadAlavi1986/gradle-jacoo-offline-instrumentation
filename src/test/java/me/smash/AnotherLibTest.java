package me.smash;


import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.SuppressStaticInitializationFor;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@SuppressStaticInitializationFor("me.smash.AnotherLib")
public class AnotherLibTest {

  @Test
  public void test1() throws IOException {
    assertThat(new AnotherLib().someMethod(null)).isEqualTo("Mohammad Alavi");
  }

  @Test
  public void test2() throws IOException {
    assertThat(new AnotherLib().someMethod("hello")).isEqualTo("You want me to say hello");
  }

}
