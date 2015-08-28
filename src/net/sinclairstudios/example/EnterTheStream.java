package net.sinclairstudios.example;

import java.util.Arrays;

public class EnterTheStream {

  public static void main(String... args) {

    Arrays.asList("a1", "a2", "b1", "b2")
        .stream()
        .filter((item) -> item.contains("a"))
        .map(String::toUpperCase)
        .forEach(System.out::println);
    // A1
    // A2
  }
}
