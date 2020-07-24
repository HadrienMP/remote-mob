package fr.hadrienmp.remote.mob;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    @ParameterizedTest
    @ValueSource(ints = {1})
    void return_the_number_otherwise(int n) {
        assertThat(fizzbuzz()).isEqualTo("1");
    }

    private String fizzbuzz() {
        return "1";
    }
}
