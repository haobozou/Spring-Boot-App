package com.example.app;

import java.util.Map;
import java.util.function.Supplier;

public class ActivityFactory {
  private static final Map<Day, Supplier<AbstractActivity>> activities =
      Map.of(
          Day.MONDAY, MondayActivity::new,
          Day.TUESDAY, TuesdayActivity::new,
          Day.WEDNESDAY, WednesdayActivity::new,
          Day.FRIDAY, FridayActivity::new,
          Day.SATURDAY, SaturdayActivity::new,
          Day.SUNDAY, SundayActivity::new);

  public static AbstractActivity findAction(String string) {
    Day day = Day.toDay(string);

    if (day == null) {
      return null;
    }

    return activities.get(day).get();
  }

  private static class MondayActivity extends AbstractActivity {
    @Override
    void prepare() {
      System.out.println("I am preparing rod and bait");
    }

    @Override
    void coreAction() {
      System.out.println("I am fishing");
    }
  }

  private static class TuesdayActivity extends AbstractActivity {
    @Override
    void prepare() {
      System.out.println("I am preparing my laptop");
    }

    @Override
    void coreAction() {
      System.out.println("I am working");
    }
  }

  private static class WednesdayActivity extends AbstractActivity {
    @Override
    void prepare() {
      System.out.println("I am preparing my books");
    }

    @Override
    void coreAction() {
      System.out.println("I am teaching");
    }
  }

  private static class FridayActivity extends AbstractActivity {
    @Override
    void prepare() {
      System.out.println("I am preparing my shoes");
    }

    @Override
    void coreAction() {
      System.out.println("I am hiking");
    }
  }

  private static class SaturdayActivity extends AbstractActivity {
    @Override
    void prepare() {
      System.out.println("I am preparing my helmet");
    }

    @Override
    void coreAction() {
      System.out.println("I am riding a bike");
    }
  }

  private static class SundayActivity extends AbstractActivity {
    @Override
    void prepare() {
      System.out.println("I am preparing my bed");
    }

    @Override
    void coreAction() {
      System.out.println("I am taking a rest");
    }
  }
}
