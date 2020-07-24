package fr.hadrienmp.remote.mob;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,2"
    })
    void return_the_number_otherwise(int n, String expected) {
        assertThat(fizzbuzz(n)).isEqualTo(expected);
    }

    private String fizzbuzz(int n) {
        return String.valueOf(n);
    }
}
