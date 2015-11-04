package org.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JavaGenCol1 {

	public static void main(String[] args) {
		// First Section for String
		List<String> words = new ArrayList<String>();
		words.add("Hello ");
		words.add("world!");
		String s = words.get(0) + words.get(1);
		System.out.println(s);
		assert s.equals("Hello world!");

		// Second Section for String
		List<String> wordlist = Arrays.asList("Hello", "World!", "My", "Name",
				"Is", "Khan");
		String str = "";
		for (String string : wordlist) {
			str = str.concat(string).concat(" ");
		}
		System.out.println(str);

		// Third Section for String
		List<String> listOfWord = Arrays.asList("Hello", "World!", "My",
				"Name", "Is", "Khan");
		String allStr = "";
		Iterator<String> its = listOfWord.iterator();
		// its.hasNext() - gives boolean. If there is any text remains
		while (its.hasNext()) {
			System.out.println(its.next());
		}

		for (Iterator<String> it = listOfWord.iterator(); it.hasNext();) {
			String text = it.next();
			allStr = allStr.concat(text).concat(" ");
		}
		System.out.println(allStr);

		// First Section for integer
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		int sum = 0;
		for (Integer value : numbers) {
			sum = sum + value;
		}
		System.out.println("Sum: " + sum);

		// Second Section for integer
		int summation = 0;
		List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6);
		for (Integer value : ints) {
			summation = summation + value;
		}
		System.out.println("Summation: " + summation);

		// Third Section for integer
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		int summ = 0;
		for (Iterator<Integer> it = intList.iterator(); it.hasNext();) {
			int n = it.next();
			summ += n;
		}
		System.out.println("Summ: " + summ);
	}

}
