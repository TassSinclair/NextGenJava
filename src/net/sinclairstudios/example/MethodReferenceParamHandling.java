package net.sinclairstudios.example;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceParamHandling {

  public static void main(String... args) {
    Function<Boolean, String> valueOfFunc = String::valueOf;
    System.out.println(valueOfFunc.apply(true)); // true

    Function<String, Integer> lengthFunc = String::length;
    System.out.println(lengthFunc.apply("pizza")); // 5

    String egg = "egg";
    Function<Integer, Character> instanceCharAtFunc = egg::charAt;
    System.out.println(instanceCharAtFunc.apply(1)); // g

    BiFunction<String, Integer, Character> staticCharAtFunc = String::charAt;
    System.out.println(staticCharAtFunc.apply("egg", 1)); // g
  }
}
