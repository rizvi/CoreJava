package org.generics;

public class MaximumTest {

	public static void main(String[] args) {
//		System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5,
//				maximum(3, 4, 5));
//
		System.out.printf("Maxm of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8,
				7.7, maximum(9.6, 9.6, 17.7));

		System.out.printf("Max of %s, %s and %s is %s\n", "pear", "apple",
				"orange", maximum("pear", "apple", "orange"));
		
		
	}


	private static Object maximum(double d, double e, double f) {
		double max = d;
		System.out.println(Double.compare(max, e));
		if (Double.compare(max, e) < 0) {
			max = e; // e is the largest so far
		}
		if (Double.compare(max, f) < 0) {
			max = f; // f is the largest now
		}
		return max; // returns the largest object
	}

	private static Object maximum(String string, String string2, String string3) {
		String max = string;
		if (string2.compareTo(max) > 0) {
			max = string2; // string2 is the largest so far
		}
		if (string3.compareTo(max) > 0) {
			max = string3; // string3 is the largest now
		}
		return max; // returns the largest object
	}

	// determines the largest of three Comparable objects
//	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
//		T max = x; // assume x is initially the largest
//		if (y.compareTo(max) > 0) {
//			max = y; // y is the largest so far
//		}
//		if (z.compareTo(max) > 0) {
//			max = z; // z is the largest now
//		}
//		return max; // returns the largest object
//	}
}
