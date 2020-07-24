package fr.hadrienmp.remote.mob;

import net.jqwik.api.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,2",
            "4,4"
    })
    void return_the_number_otherwise(int n, String expected) {
        assertThat(fizzbuzz(n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    @DisplayName("return fizz for multiples of three")
    void return_fizz_for(int multipleOfThree) {
        assertThat(fizzbuzz(multipleOfThree)).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    @DisplayName("return buzz for multiples of five")
    void return_buzz_for(int multipleOf5) {
        assertThat(fizzbuzz(multipleOf5)).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 45, 60, 15015})
    @DisplayName("return buzz for multiples of 3 and 5")
    void return_fizzbuzz_for(int multipleOf3And5) {
        assertThat(fizzbuzz(multipleOf3And5)).isEqualTo("FizzBuzz");
    }

    @Property
    public boolean stuff(@ForAll("multiplesOf3And5") int multipleOf3And5) {
        return "FizzBuzz".equals(fizzbuzz(multipleOf3And5));
    }

    @Provide
    public Arbitrary<Integer> multiplesOf3And5() {
        return Arbitraries.integers()
                          .filter(integer -> integer % 3 == 0 && integer % 5 == 0);
    }

    public static String fizzbuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz";
        if (n % 5 == 0) return "Buzz";
        if (n % 3 == 0) return "Fizz";
        return String.valueOf(n);
    }
}
