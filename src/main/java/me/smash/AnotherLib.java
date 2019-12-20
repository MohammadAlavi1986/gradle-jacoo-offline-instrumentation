package me.smash;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class AnotherLib {

  static {
    System.exit(-1);
  }

  public String someMethod(String arg) throws IOException {
    if (arg != null && arg.toUpperCase().equals("HELLO")) {
      return "You want me to say hello";
    } else {
      byte[] buffer = new byte[1034];
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      baos.write("Mohammad Alavi".getBytes(StandardCharsets.UTF_8));

      return new BufferedReader(new InputStreamReader(new ByteArrayInputStream(baos.toByteArray())))
          .readLine();
    }
  }
}
