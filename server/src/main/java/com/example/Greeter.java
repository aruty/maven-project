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
   * @param String someone
   * @return String formatted hello
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
