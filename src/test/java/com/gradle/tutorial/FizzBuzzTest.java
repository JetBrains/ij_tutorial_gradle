package com.gradle.tutorial;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
  @Test
  public void FizzBuzzNormalNumbers() {

    FizzBuzzProcessor fb = new FizzBuzzProcessor();
    Assert.assertEquals("1", FizzBuzzProcessor.convert(1));
    Assert.assertEquals("2", FizzBuzzProcessor.convert(2));
  }

  @Test
  public void FizzBuzzThreeNumbers() {

    FizzBuzzProcessor fb = new FizzBuzzProcessor();
    Assert.assertEquals("Fizz", FizzBuzzProcessor.convert(3));
  }

  @Test
  public void FizzBuzzFiveNumbers() {

    FizzBuzzProcessor fb = new FizzBuzzProcessor();
    Assert.assertEquals("Buzz", FizzBuzzProcessor.convert(5));
  }

  @Test
  public void FizzBuzzThreeAndFiveNumbers() {

    FizzBuzzProcessor fb = new FizzBuzzProcessor();
    Assert.assertEquals("Buzz", FizzBuzzProcessor.convert(5));
  }


}
