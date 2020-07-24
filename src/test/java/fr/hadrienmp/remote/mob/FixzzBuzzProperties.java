package fr.hadrienmp.remote.mob;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;

import static fr.hadrienmp.remote.mob.FizzBuzzTest.fizzbuzz;

public class FixzzBuzzProperties {
    @Property
    boolean multi(@ForAll("mutliplesOf3And5") int i) {
        return "FizzBuzz".equals(fizzbuzz(i));
    }
}
