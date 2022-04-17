package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testOne() {
        assertEquals("1", FizzBuzz.print(1));
    }

    @Test
    public void testTwo() {
        assertEquals("2", FizzBuzz.print(2));
    }

    @Test
    public void testThree() {
        assertEquals("Fizz", FizzBuzz.print(3));
    }

    @Test
    public void testFour() {
        assertEquals("4", FizzBuzz.print(4));
    }

    @Test
    public void testFive() {
        assertEquals("Buzz", FizzBuzz.print(5));
    }

    @Test
    public void testSix() {
        assertEquals("Fizz", FizzBuzz.print(6));
    }

    @Test
    public void testSeven() {
        assertEquals("7", FizzBuzz.print(7));
    }

    @Test
    public void testNine() {
        assertEquals("Fizz", FizzBuzz.print(9));
    }

    @Test
    public void testTen() {
        assertEquals("Buzz", FizzBuzz.print(10));
    }

    @Test
    public void testTwelve() {
        assertEquals("Fizz", FizzBuzz.print(12));
    }

    @Test
    public void testFifteen() {
        assertEquals("FizzBuzz", FizzBuzz.print(15));
    }

    @Test
    public void testThirty() {
        assertEquals("FizzBuzz", FizzBuzz.print(30));
    }
}
