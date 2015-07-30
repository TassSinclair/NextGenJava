package net.sinclairstudios.example;

import java.util.function.Function;

public class S1MethodsAsFirstClassCitizens {

  public static void main(String... args) {

    Function<String, String> louder1 = new Function<String, String>() {
      public String apply(String string) {
        return string.toUpperCase();
      }
    };

    System.out.println(louder1.apply("String One")); // STRING ONE
  }
}
