package net.sinclairstudios.example;

import java.util.*;
import java.util.function.*;

public class LambdaExample {

  public static void main(String... args) {

    // Yeah, but why?

    Day day = Day.FRI.getNextDayOfWeek();
    if (day != null) {
      System.out.println(day);
    }

    List<String> myList = new ArrayList<>();

    Consumer<String> consumer = myList::add;

    Optional.ofNullable(Day.SAT.getNextDayOfWeek())
        .ifPresent((Day d) -> System.out.println(d));

    Optional.ofNullable(Day.SAT.getNextDayOfWeek())
        .ifPresent(System.out::println);

    Supplier<Double> random = () -> Math.random();
    Function<String, Integer> length = (String s) -> s.length();

    Function<Integer, String> valueOfInt = String::valueOf;
    BiFunction<String, Integer, String> stringIntegerStringBiFunction = String::substring;
    Function<String, Long> toLong = Long::new;

    BiFunction<String, String, String> func = (String a, String b) -> { return a + "," + b; };

    List<String> list = Arrays.asList("C", "A", "a", "D", "B");
    list.sort((a, b) -> a.toUpperCase().compareTo(b.toUpperCase()));
    list.forEach((s) -> System.out.print(s + ", "));

  iterativeLoopFlow();
  functionalStreamFLow();
  }

  public static void iterativeLoopFlow() {
    List<String> originals = Arrays.asList("One", "Two", "Three");
    List<String> replacements = new ArrayList<>();
    for (String original : originals) {
      String replacement = original.replace("e", "i");
      System.out.println(original + " becomes " + replacement);
      replacements.add(replacement);
    }
    List<String> louder = new ArrayList<>();
    for (String replacement : replacements) {
      String upperCase = replacement.toUpperCase();
      System.out.println(replacement + " becomes " + upperCase);
      louder.add(upperCase);
    }
  }

  public static void functionalStreamFLow() {
    Arrays.asList("One", "Two", "Three").stream().map((original -> {
      String replacement = original.replace("e", "i");
      System.out.println(original + " becomes " + replacement);
      return replacement;
    })).map((replacement -> {
      String upperCase = replacement.toUpperCase();
      System.out.println(replacement + " becomes " + upperCase);
      return upperCase;
    })).forEach(System.out::println);
  }
}
