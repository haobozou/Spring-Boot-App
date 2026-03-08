package com.example.app;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum Day {
  MONDAY("MONDAY", "MON"),
  TUESDAY("TUESDAY", "TUE"),
  WEDNESDAY("WEDNESDAY", "WED"),
  THURSDAY("THURSDAY", "THU"),
  FRIDAY("FRIDAY", "FRI"),
  SATURDAY("SATURDAY", "SAT"),
  SUNDAY("SUNDAY", "SUN");

  private final String fullWord;
  private final String abbreviation;

  Day(String fullWord, String abbreviation) {
    this.fullWord = fullWord;
    this.abbreviation = abbreviation;
  }

  public static Optional<Day> toDay(String string) {
    return Arrays.stream(Day.values())
        .filter(day -> List.of(day.abbreviation, day.fullWord).contains(string.toUpperCase()))
        .findFirst();
  }
}
