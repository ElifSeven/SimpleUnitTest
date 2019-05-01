package com.elif.seven.testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

	@Test
	public void testVowelCharacters() {

		CharacterFinding characterFinding = new CharacterFinding();
		int returnVowel = characterFinding.howManyVowel("elifseven");

		Assert.assertEquals(4, returnVowel);
	}

	@Test
	public void testConsonantCharacter() {
		CharacterFinding characterFinding = new CharacterFinding();
		int returnConsonant = characterFinding.howManyConsonant("elifseven");

		Assert.assertEquals(5, returnConsonant);
	}

}
