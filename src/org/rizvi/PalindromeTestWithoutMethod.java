package org.rizvi;

public class PalindromeTestWithoutMethod {
	public static void main(String[] args) {
		String str = "alapalaalapala";
		char[] warray = str.toCharArray();
		if (isPalindrome(warray)) {
			System.out.println(str + " is Palindrome");
		} else {
			System.out.println(str + " is not Palindrome");
		}
	}

	public static boolean isPalindrome(char[] word) {
		int i1 = 0;
		int i2 = word.length - 1;
		while (i2 > i1) {
			if (word[i1] != word[i2]) {
				return false;
			}
			++i1;
			--i2;
		}
		return true;
	}
}
