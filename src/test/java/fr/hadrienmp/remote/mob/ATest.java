package fr.hadrienmp.remote.mob;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ATest {
    @ParameterizedTest
    @ValueSource(ints = {1})
    void one() {
        assertThat(fizzbuzz()).isEqualTo("1");
    }

    private String fizzbuzz() {
        return "1";
    }
}
