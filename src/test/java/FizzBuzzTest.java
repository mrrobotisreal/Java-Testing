import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void fizzBuzzShouldReturnFizzIfDivisibleByThree() {
        // Setup
        FizzBuzz fizzbuzz = new FizzBuzz();
        // Enact
        String expect = "Fizz";
        String actualWithThree = fizzbuzz.foo(3);
        String actualWithSix = fizzbuzz.foo(6);
        // Assert
        assertEquals(expect, actualWithThree);
        assertEquals(expect, actualWithSix);
        // Teardown
    }

    @Test
    public void fizzBuzzShouldReturnNumberIfNotDivisibleByThreeOrFive() {
        // Setup
        FizzBuzz fizzbuzz = new FizzBuzz();
        // Exercise (Enact)
        String expectWithSeven = "7";
        String expectWithEight = "8";
        String expectWithEleven = "11";
        String actualWithSeven = fizzbuzz.foo(7);
        String actualWithEight = fizzbuzz.foo(8);
        String actualWithEleven = fizzbuzz.foo(11);
        // Assert
        assertEquals(expectWithSeven, actualWithSeven);
        assertEquals(expectWithEight, actualWithEight);
        assertEquals(expectWithEleven, actualWithEleven);
    }

    @Test
    public void fizzBuzzShouldReturnBuzzIfDivisibleByFive() {
        // Setup
        FizzBuzz fizzbuzz = new FizzBuzz();
        // Enact
        String expect = "Buzz";
        String actualWithFive = fizzbuzz.foo(5);
        String actualWithTen = fizzbuzz.foo(10);
        String actualWithFifteen = fizzbuzz.foo(15);
        String actualWithTwenty = fizzbuzz.foo(20);
        // Assert
        assertEquals(expect, actualWithFive);
    }

    @Test
    public void fizzBuzzShouldReturnFizzBuzzIfDivisibleByThreeAndFive() {
        // Setup
        FizzBuzz fizzbuzz = new FizzBuzz();
        // Enact
        String expect = "FizzBuzz";
        String actualWithFifteen = fizzbuzz.foo(15);
        String actualWithThirty = fizzbuzz.foo(30);
        // Assert
        assertEquals(expect, actualWithFifteen);
        assertEquals(expect, actualWithThirty);
    }
}
