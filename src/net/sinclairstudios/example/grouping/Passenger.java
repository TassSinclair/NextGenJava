package net.sinclairstudios.example.grouping;

public class Passenger {

  private final String name;
  private final Nationality nationality;
  private final int age;

  public Passenger(String name, Nationality nationality, int age) {
    this.name = name;
    this.nationality = nationality;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public Nationality getNationality() {
    return nationality;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return String.format("%s (%s)", getName(), getAge());
  }
}
