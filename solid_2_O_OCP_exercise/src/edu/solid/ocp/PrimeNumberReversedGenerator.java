package edu.solid.ocp;

import java.util.Comparator;

public class PrimeNumberReversedGenerator extends AbstractPrimeNumberGenerator {

    @Override
    protected Comparator<Integer> getComparator() {
        return (o1, o2) -> o2 - o1;
    }

}
