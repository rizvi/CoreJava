package org.rizvi;

import java.util.*;

public class Test {
	public static void main(String[] args) {
//		args[0] = "1000";
//		args[1] = "1000";
//		int sourceSize = Integer.parseInt(args[0]);
//		int removalsSize = Integer.parseInt(args[1]);

		int sourceSize = Integer.parseInt("1000");
		int removalsSize = Integer.parseInt("1000");

		Set<Integer> source = new HashSet<Integer>();
		Collection<Integer> removals = new ArrayList<Integer>();
//		long start1 = System.currentTimeMillis();
		for (int i = 0; i < sourceSize; i++) {
			source.add(i);
		}
//		long end1 = System.currentTimeMillis();
//		System.out.println("Time taken: " + (end1 - start1) + "ms");

//		long start2 = System.currentTimeMillis();
		for (int i = 1; i <= removalsSize; i++) {
			removals.add(-i);
		}
//		long end2 = System.currentTimeMillis();
//		System.out.println("Time taken: " + (end2 - start2) + "ms");

		long start = System.currentTimeMillis();
		source.removeAll(removals);
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start) + "ms");
	}
}
