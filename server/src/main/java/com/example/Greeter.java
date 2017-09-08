package com.example;

/**
 * This is a class.
 * @author Hayk
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Returns hello someone.
   *
   * @param someone the name of a person
   * @return formatted hello
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
