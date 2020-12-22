package edu.solid.ocp;

import java.util.Comparator;

public class PrimeNumberForwardGenerator extends AbstractPrimeNumberGenerator{

	@Override
	protected Comparator<Integer> getComparator() {
		return Comparator.comparingInt(o -> o);
	}

}
