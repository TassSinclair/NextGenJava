package net.sinclairstudios.example.flatmapping;

public class JourneyFlight {
  private final String code;
  private FlightStatus status;

  public JourneyFlight(String code) {
    this.code = code;
    this.status = FlightStatus.OK;
  }

  public String getCode() {
    return code;
  }

  public FlightStatus getStatus() {
    return status;
  }

  public JourneyFlight flown() {
    this.status = FlightStatus.FLOWN;
    return this;
  }

  public JourneyFlight disrupted() {
    this.status = FlightStatus.DISRUPTED;
    return this;
  }

  public boolean isFlown() {
    return this.status == FlightStatus.FLOWN;
  }

  @Override
  public String toString() {
    return String.format("%s (%s)", code, status);
  }
}
