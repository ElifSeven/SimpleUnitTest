package com.elif.seven.testing;

public class CharacterFinding {

	public int howManyVowel(String string) {

		String vowels = "aeoöuüıiAEOÖUÜIİ";
		int sum = 0;
		for (int i = 0; i < string.length(); i++) {
			if (vowels.indexOf(string.charAt(i)) != -1) {
				sum++;
			}
		}
		return sum;
	}

	public int howManyConsonant(String string) {

		return string.length() - howManyVowel(string);
	}

}
