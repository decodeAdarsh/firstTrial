package com.Testings;

import java.util.Random;

public class RandomNum {

	public int generateRandom() {
		Random random=new Random();
		return random.nextInt(100);
	}
}
