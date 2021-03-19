package ru.hh.career.solution;

import ru.hh.nab.starter.NabApplication;

public class Main {

  public static void main(String[] args) {
    NabApplication.builder()
      .configureJersey(JerseyConfig.class).bindToRoot()
      .build().run(ProdConfig.class);
  }
}
