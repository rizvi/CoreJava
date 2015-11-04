package org.generics;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello World");
		List<Integer> ints = Arrays.asList(1, 2, 3);
		System.out.println("Size of array: "+ints.size());
		int s = 0;
		for (int n : ints) {
			System.out.print("Summation of "+s+" and "+n+" : ");
			s += n;
			System.out.println(s);
		}
		System.out.println("s: " + s);
		assert s == 4;
	}

}
