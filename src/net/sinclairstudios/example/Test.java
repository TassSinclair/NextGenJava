package net.sinclairstudios.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

  public static void main(String... args) {

    List<String> original = Arrays.asList("a1", "a2", "b1", "b2");


    Stream.of("num", "sum", "rum")
        .filter((item) -> item.startsWith("r"))
        .forEach(System.out::println);

    List<String> collected = original
        .parallelStream()
        .filter((item) -> item.contains("a"))
        .map(String::toUpperCase)
        .collect(Collectors.toList());

    System.out.println(original);
    System.out.println(collected);
  }
}
