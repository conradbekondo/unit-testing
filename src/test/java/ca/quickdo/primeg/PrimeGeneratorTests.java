package ca.quickdo.primeg;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class PrimeGeneratorTests {
    private PrimeGenerator primeGenerator;

    @BeforeEach
    public void init() {
        primeGenerator = new PrimeGenerator();
    }

    @Test
    public void primeGeneratorTestWithNegativeInputTest() {
        final var expectation = new Integer[]{};
        final var result = primeGenerator.getNPrimes(-1);
        Assertions.assertArrayEquals(expectation, result);
    }

    @Test
    public void primeGeneratorWithInputLessThan4Test() {
        final var input = new Random().nextInt(3) + 1;
        final var expectation = new Integer[]{1, 2, 3};
        final var result = primeGenerator.getNPrimes(input);
        Assertions.assertArrayEquals(expectation, result);
    }

    @Test
    public void primeGeneratorWithInputGreaterThanOrEqualTo4() {
        final var input = 20;
        final var expectation = new Integer[]{1, 2, 3, 5, 7, 11, 13, 17, 19};
        final var result = primeGenerator.getNPrimes(input);
        Assertions.assertArrayEquals(expectation, result);
    }
}
