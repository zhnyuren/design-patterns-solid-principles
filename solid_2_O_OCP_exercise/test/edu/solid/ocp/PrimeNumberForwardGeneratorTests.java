package edu.solid.ocp;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;

public class PrimeNumberForwardGeneratorTests {
	
	@Test
	public void test_natural_order() {
		AbstractPrimeNumberGenerator generator = new PrimeNumberForwardGenerator();
		List<Integer> expected = Arrays.asList(2,3,5,7,11,13);
		
		Assert.assertThat(generator.primes(15), is(expected));
	}

}
