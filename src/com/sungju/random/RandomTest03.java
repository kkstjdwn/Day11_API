package com.sungju.random;

import java.util.ArrayList;
import java.util.Random;

public class RandomTest03 {

	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("불고기");
		ar.add("라면");
		ar.add("햄버거");
		ar.add("스윙스");
		ar.add("굶기");
		ar.add("떡볶이");
		
		int num = random.nextInt(ar.size());
		System.out.println(ar.get(random.nextInt(ar.size())));


	}

}
