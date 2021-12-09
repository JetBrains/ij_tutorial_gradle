package com.gradle.tutorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
  @Test
  public void FizzBuzzNormalNumbers() {

    FizzBuzzProcessor fb = new FizzBuzzProcessor();
    Assertions.assertEquals("1", FizzBuzzProcessor.convert(1));
    Assertions.assertEquals("2", FizzBuzzProcessor.convert(2));
  }

  @Test
  public void FizzBuzzThreeNumbers() {

    FizzBuzzProcessor fb = new FizzBuzzProcessor();
    Assertions.assertEquals("Fizz", FizzBuzzProcessor.convert(3));
  }

  @Test
  public void FizzBuzzFiveNumbers() {

    FizzBuzzProcessor fb = new FizzBuzzProcessor();
    Assertions.assertEquals("Buzz", FizzBuzzProcessor.convert(5));
  }

  @Test
  public void FizzBuzzThreeAndFiveNumbers() {

    FizzBuzzProcessor fb = new FizzBuzzProcessor();
    Assertions.assertEquals("Buzz", FizzBuzzProcessor.convert(5));
  }


}
