package net.sinclairstudios.example.flatmapping;

import java.util.List;

public class JourneyLeg {
  private final List<JourneyFlight> journeyFlights;

  public JourneyLeg(List<JourneyFlight> journeyFlights) {
    this.journeyFlights = journeyFlights;
  }

  public List<JourneyFlight> getJourneyFlights() {
    return journeyFlights;
  }
}
