package net.sinclairstudios.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class S5AnatomyOfALambda {

  public static void main(String... args) {

    List<String> list = Arrays.asList("C", "A", "a", "D", "B");

    // A comparator that compares uppercase versions of each item
    list.sort((a, b) -> a.toUpperCase().compareTo(b.toUpperCase()));

    list.forEach(System.out::print); // AaBCD

    functionsExample();
    predicatesExample();
    comsumersExample();
  }

  public static void functionsExample() {
    // Lambda function
    Function<String, Integer> length = (String s) -> s.length();

    // Method reference
    Function<Integer, String> valueOfInt = String::valueOf;
  }

  public static void predicatesExample() {
    // Lambda function
    Predicate<String> isInteger = (String s) -> s.matches("-?\\d+");

    // Method reference
    Predicate<Collection> isEmpty = Collection::isEmpty;
  }

  public static void comsumersExample() {
    // Lambda function
    Consumer<String> printOut = (String s) -> System.out.println(s);

    // Method reference
    List<String> myList = new ArrayList<>();
    Consumer<String> addToList = myList::add;
  }
}
