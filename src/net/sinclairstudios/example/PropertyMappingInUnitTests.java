package net.sinclairstudios.example;

import net.sinclairstudios.example.propertymapping.Person;

import java.util.Arrays;
import java.util.List;

public class PropertyMappingInUnitTests {

  public static void main(String... args) {

    List<Person> people = Arrays.asList(
        new Person("John"), new Person("Paul"), new Person("George"), new Person("Ringo")
    );

    withFest(people);
    withAspectJ(people);
  }

  public static void withFest(List<Person> people) {

    org.fest.assertions.Assertions.assertThat(people).onProperty("name")
        .containsExactly("John", "Paul", "George", "Ringo");
  }

  public static void withAspectJ(List<Person> people) {

    org.assertj.core.api.Assertions.assertThat(people).extracting(Person::getName)
        .containsExactly("John", "Paul", "George", "Ringo");
  }
}
