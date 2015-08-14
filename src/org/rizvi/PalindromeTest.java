package org.rizvi;

public class PalindromeTest {
	public static void main(String args[]) {
		String str = "alapalaalapala";
		if (isPalindrome(str)) {
			System.out.println(str + " is Palindrome");
		} else {
			System.out.println(str + " is not Palindrome");
		}
	}

	public static boolean isPalindrome(String str) {
		int n = str.length();
		for (int i = 0; i < n / 2; i++) {
			System.out.println("counter for how much time is for loop rotating: "+i);
			if (str.charAt(i) != str.charAt(n - i - 1))
			{
				return false;
			}
		}
		return true;
	}
}
