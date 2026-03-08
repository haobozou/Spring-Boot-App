package com.example.app;

public abstract class AbstractActivity {
  abstract void prepare();

  abstract void coreAction();

  void finish() {
    System.out.println("Go Home");
  }

  public void doAction() {
    prepare();
    coreAction();
    finish();
  }
}
