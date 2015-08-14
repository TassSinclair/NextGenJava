package net.sinclairstudios.example.flatmapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerExample {
  public static void main(String... args) {
    List<List<Integer>> multiList = Arrays.asList(
        Arrays.asList(6), Arrays.asList(2, 4, 5), Arrays.asList(1, 3)
    );

    List<Integer> list = multiList.stream()
        .flatMap(List::stream)
        .collect(Collectors.toList()); // 6 2 4 5 1 3

    list.forEach(System.out::println);
  }
}
