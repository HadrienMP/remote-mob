package fr.hadrienmp.remote.mob.fizzbuzz.fa_2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzSpec {
    @Test
    void one() {
        assertThat(fizzbuzz()).isEqualTo("1");
    }

    private String fizzbuzz() {
        return "1";
    }
}
