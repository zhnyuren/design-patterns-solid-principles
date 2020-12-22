package edu.solid.ocp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PrimeNumberGenerator {

	protected Comparator<Integer> getComparator() {
		return Comparator.comparingInt(o -> o);
	}
	
	public List<Integer> primes (int limit) {
		List<Integer> primes = new ArrayList<>();
		for (int i = 2; i < limit; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		primes.sort(getComparator());
		return primes;
	}
	
	private boolean isPrime (int candidate) {
		for (int i = 2; i < candidate; i++) {
			if (candidate % i == 0) {
				return false;
			}
		}
		return true;
	}

}
