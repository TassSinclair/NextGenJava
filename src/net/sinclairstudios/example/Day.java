package net.sinclairstudios.example;

public enum Day {
  MON, TUE, WED, THU, FRI, SAT, SUN;

  public String toString() {
    return "A " + name();
  }

  public Day getNextDayOfWeek() {
    if (this != SUN)
      return values()[ordinal() + 1];
    else
      return null;
  }
}