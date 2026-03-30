package org.gradle.tutorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void FizzBuzzNormalNumbers() {
        Assertions.assertEquals
                ("1", FizzBuzzProcessor.convert(1));
        Assertions.assertEquals
                ("2", FizzBuzzProcessor.convert(2));
    }

    @Test
    public void FizzBuzzThreeNumbers() {
        Assertions.assertEquals
                ("Fizz", FizzBuzzProcessor.convert(3));
    }

    @Test
    public void FizzBuzzFiveNumbers() {
        Assertions.assertEquals
                ("Buzz", FizzBuzzProcessor.convert(5));
    }

    @Test
    public void FizzBuzzThreeAndFiveNumbers() {
        Assertions.assertEquals
                ("FizzBuzz", FizzBuzzProcessor.convert(15));
    }
}