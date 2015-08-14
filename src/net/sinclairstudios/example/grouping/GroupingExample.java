package net.sinclairstudios.example.grouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample {
  public static void main(String... args) {
    List<String> strings = Arrays.asList("foo", "bar", "baz");

    Map<Character, List<String>> byFirstChar = strings.stream()
        .collect(Collectors.groupingBy((s) -> s.charAt(0)));

    byFirstChar.forEach((c, s) -> System.out.println(c + ": " + s));
  }
}
