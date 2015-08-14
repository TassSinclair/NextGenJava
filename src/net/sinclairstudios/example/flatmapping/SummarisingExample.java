package net.sinclairstudios.example.flatmapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummarisingExample {
  public static void main(String... args) {

    Journey journey = new Journey(Arrays.asList(
        new JourneyLeg(Arrays.asList(
            new JourneyFlight("NZ123").flown(),
            new JourneyFlight("NZ234").flown()
        )),
        new JourneyLeg(Arrays.asList(
            new JourneyFlight("NZ345"),
            new JourneyFlight("NZ456").disrupted()
        ))
    ));

    boolean perfectJourney = journey.getJourneyLegs().stream()
        .map(JourneyLeg::getJourneyFlights)
        .flatMap(List::stream)
        .allMatch(JourneyFlight::isFlown);

    boolean anyFlightsDisrupted = journey.getJourneyLegs().stream()
        .flatMap((jl) -> jl.getJourneyFlights().stream())
        .anyMatch((jf) -> jf.getStatus() == FlightStatus.DISRUPTED);

    System.out.println(perfectJourney);
    System.out.println(anyFlightsDisrupted);
  }
}
