package net.sinclairstudios.example.grouping;

public enum AgeGroup {
  INFANT,
  CHILD,
  ADULT;

  public static AgeGroup ageGroupFor(int age) {
    if (age < 3) {
      return INFANT;
    }
    if (age < 12) {
      return CHILD;
    }
    return ADULT;
  }
}
