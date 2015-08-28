package net.sinclairstudios.example;

import java.util.function.Function;

public class ExpressedAsALambda {

  public static void main(String... args) {

    Function<String, String> louder2 = (String s) -> s.toUpperCase();

    System.out.println(louder2.apply("String Two")); // STRING TWO

    Function<String, String> louder3 = String::toUpperCase;

    System.out.println(louder3.apply("String Three")); // STRING THREE
  }
}
