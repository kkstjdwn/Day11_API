package com.sungju.random;

import java.util.Random;

public class RandomTest01 {

	public static void main(String[] args) {
		Random random = new Random();

		int num = random.nextInt();
		
		num = random.nextInt(20); //0~19
		
		System.out.println(num);
	}

}
