package net.sinclairstudios.example.flatmapping;

import java.util.List;

public class Journey {
  public final List<JourneyLeg> journeyLegs;

  public Journey(List<JourneyLeg> journeyLegs) {
    this.journeyLegs = journeyLegs;
  }

  public List<JourneyLeg> getJourneyLegs() {
    return journeyLegs;
  }
}
