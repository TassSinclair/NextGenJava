package net.sinclairstudios.example.flatmapping;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JourneyFlightMapper {
  public static void main(String... args) {
    List<JourneyFlight> journeyFlights = Arrays.asList(
        new JourneyFlight("NZ123").flown(),
        new JourneyFlight("NZ234"),
        new JourneyFlight("NZ345").disrupted()
    );

    codesAndStatusesMap1(journeyFlights);
    codesAndStatusesMap2(journeyFlights);
    journeyFlightAndStatusesMap(journeyFlights);
  }

  private static void codesAndStatusesMap1(Collection<JourneyFlight> journeyFlights) {
    Map<String, FlightStatus> codesAndStatuses = journeyFlights.stream()
        .collect(Collectors.toMap(
            (journeyFlight) -> journeyFlight.getCode(),
            (journeyFlight) -> journeyFlight.getStatus()
        ));
    codesAndStatuses.forEach((a, b) -> System.out.println(a + ", " + b));
  }

  private static void codesAndStatusesMap2(Collection<JourneyFlight> journeyFlights) {
    Map<String, FlightStatus> codesAndStatuses = journeyFlights.stream()
        .collect(Collectors.toMap(
            JourneyFlight::getCode,
            JourneyFlight::getStatus
        ));
    codesAndStatuses.forEach((a, b) -> System.out.println(a + ", " + b));
  }

  private static void journeyFlightAndStatusesMap(Collection<JourneyFlight> journeyFlights) {
    Map<JourneyFlight, FlightStatus> flightsAndStatuses = journeyFlights.stream()
        .collect(Collectors.toMap(
            jf -> jf,
            JourneyFlight::getStatus
        ));
    flightsAndStatuses.forEach((a, b) -> System.out.println(a + ", " + b));
  }
}
