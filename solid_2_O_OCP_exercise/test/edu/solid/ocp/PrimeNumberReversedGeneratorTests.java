package edu.solid.ocp;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;

public class PrimeNumberReversedGeneratorTests {

    @Test
    public void test_reverse_order() {
        AbstractPrimeNumberGenerator generator = new PrimeNumberReversedGenerator();
        List<Integer> expected = Arrays.asList(13,11,7,5,3,2);

        Assert.assertThat(generator.primes(15), is(expected));
    }

}
