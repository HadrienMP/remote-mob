package fr.hadrienmp.remote.mob.fizzbuzz.fa_2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzSpec {
    @Test
    void one() {
        assertThat(fizzbuzz(1)).isEqualTo("1");
    }
    @Test
    void two() {
        assertThat(fizzbuzz(2)).isEqualTo("2");
    }

    private String fizzbuzz(int i) {
        return "" + i;
    }
}
