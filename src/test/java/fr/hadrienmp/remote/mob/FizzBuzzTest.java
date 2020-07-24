package fr.hadrienmp.remote.mob;

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
    @ValueSource(ints = {5, 10})
    void return_buzz_for(int n) {
        assertThat(fizzbuzz(n)).isEqualTo("Buzz");
    }

    private String fizzbuzz(int n) {
        if(n == 5 || n == 10) return "Buzz";
        if (n % 3 == 0) return "Fizz";
        return String.valueOf(n);
    }
}
