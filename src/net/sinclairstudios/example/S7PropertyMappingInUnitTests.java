package net.sinclairstudios.example;

import net.sinclairstudios.example.s7classes.Choice;
import net.sinclairstudios.example.s7classes.ChoiceBean;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class S7PropertyMappingInUnitTests {

  public static void main(String... args) {

    List<ChoiceBean> choiceBeans = Stream.of(Choice.values()).map(ChoiceBean::new).collect(Collectors.toList());

    withFest(choiceBeans);
    withAspectJ(choiceBeans);
  }

  public static void withFest(List<ChoiceBean> choiceBeans) {

    org.fest.assertions.Assertions.assertThat(choiceBeans).onProperty("choice")
        .containsExactly(Choice.keep, Choice.change, Choice.cancel);
  }

  public static void withAspectJ(List<ChoiceBean> choiceBeans) {

    org.assertj.core.api.Assertions.assertThat(choiceBeans).extracting(ChoiceBean::getChoice)
        .containsExactly(Choice.keep, Choice.change, Choice.cancel);
  }
}
