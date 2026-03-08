package com.example.app;

import java.util.Objects;
import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppApplication {

  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      do {
        String input = scanner.nextLine();
        if (Objects.equals(input, "quit")) {
          break;
        }

        AbstractActivity activity = ActivityFactory.findAction(input);
        if (activity == null) {
          System.out.println("No such option");
          continue;
        }

        activity.doAction();
      } while (true);
    }

    System.out.println("Bye bye");
  }
}
