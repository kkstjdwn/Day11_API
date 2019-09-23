package com.sungju.random;

import java.util.ArrayList;
import java.util.Random;

public class RandomTest04 {
	public static void main(String[] args) {
		/**
		 * 닭다리쿠션 3개40,최신폰10,은갈치넥타이50
		 */

		Random random = new Random();

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("닭다리쿠션");
		ar.add("최신폰");
		ar.add("은갈치넥타이");

		System.out.println("돌려돌려돌림판");
		int lucky = random.nextInt(101);
		System.out.println(lucky);
		if (lucky <= 10) {
			// System.out.println("최신폰 당첨");
			System.out.println(ar.get(1) + " 당첨");

		} else if (lucky <= 50) {
			System.out.println(ar.get(0) + " 당첨");
		} else {
			System.out.println(ar.get(2) + " 당첨");
		}

	}

}
