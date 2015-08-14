package net.sinclairstudios.example.grouping;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PaxMapper {

  public static void main(String... args) {

    List<Passenger> passengers = Arrays.asList(
        new Passenger("Fred Jones", Nationality.NZ, 46),
        new Passenger("Mary Jones", Nationality.NZ, 44),
        new Passenger("Kaylee Jones", Nationality.NZ, 10),
        new Passenger("Carson Jones", Nationality.AU, 2));

    printPassengersGroupedByNationality(passengers);
    printPassengersGroupedByAgeGroup(passengers);
  }

  private static void printPassengersGroupedByNationality(List<Passenger> passengers) {
    Map<Nationality, List<Passenger>> passengersGroupedByNationality = passengers
        .stream()
        .collect(Collectors.groupingBy(Passenger::getNationality));

    passengersGroupedByNationality.forEach((nationality, passengerList) -> System.out.println(nationality + ": " + passengerList));
  }

  private static void printPassengersGroupedByAgeGroup(List<Passenger> passengers) {
    Map<AgeGroup, List<Passenger>> passengersGroupedByAgeGroup = passengers
        .stream()
        .collect(Collectors.groupingBy(passenger -> AgeGroup.ageGroupFor(passenger.getAge())));

    passengersGroupedByAgeGroup.forEach((ageGroup, passengerList) -> System.out.println(ageGroup + ": " + passengerList));
  }


}
