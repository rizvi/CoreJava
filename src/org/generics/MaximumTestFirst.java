package org.generics;

public class MaximumTestFirst {

	public static void main(String[] args) {
		System.out.println(maximum(8.5, 6.5));
	}

	private static <T extends Comparable<T>> T maximum(T d1, T d2) {
		T max = d1;
		if (d2.compareTo(max) > 0) {
			max = d2; // d2 is the largest so far
		}
		return max;
	}
}
