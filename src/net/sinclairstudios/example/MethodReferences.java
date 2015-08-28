package net.sinclairstudios.example;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferences {
  public static void main(String... args) {

    Function<Boolean, String> valueOf = String::valueOf;
    System.out.println(valueOf.apply(true)); // true

    Function<String, Integer> length = String::length;
    System.out.println(length.apply("pizza")); // 5

    BiFunction<String, Integer, Character> staticCharAt = String::charAt;
    System.out.println(staticCharAt.apply("egg", 1)); // g

    String bar = "egg";
    Function<Integer, Character> instanceCharAt = bar::charAt;
    System.out.println(instanceCharAt.apply(1)); // g
  }
}
